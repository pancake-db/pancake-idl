use std::collections::HashSet;

use async_raft::{AppData, AppDataResponse};
use async_raft::raft::{AppendEntriesRequest, Entry, EntryPayload, MembershipConfig, AppendEntriesResponse, ConflictOpt, InstallSnapshotRequest, InstallSnapshotResponse, VoteRequest, VoteResponse};
use protobuf::MessageField;

use crate::raft::{MembershipConfig as PancakeMembershipConfig, MutateRequest, RaftEntry, SnapshotPointer, RaftAppendEntriesRequest, RaftAppendEntriesResponse, RaftInstallSnapshotRequest, RaftInstallSnapshotResponse, RaftVoteRequest, RaftVoteResponse};
use crate::raft::raft_entry::Payload;

impl AppData for crate::raft::MutateRequest {}

impl AppDataResponse for crate::raft::MutateResponse {}

impl From<&MembershipConfig> for PancakeMembershipConfig {
  fn from(config: &MembershipConfig) -> Self {
    PancakeMembershipConfig {
      members: config.members.iter().cloned().collect(),
      has_members_after_consensus: config.members_after_consensus.is_some(),
      members_after_consensus: config.members_after_consensus
        .as_ref()
        .unwrap_or(&HashSet::new())
        .iter()
        .cloned()
        .collect(),
      ..Default::default()
    }
  }
}

impl From<&Entry<MutateRequest>> for RaftEntry {
  fn from(e: &Entry<MutateRequest>) -> Self {
    let payload = match &e.payload {
      EntryPayload::Blank => None,
      EntryPayload::Normal(req) => Some(Payload::normal(req.data.clone())),
      EntryPayload::ConfigChange(change) => {
        let pb_membership = PancakeMembershipConfig::from(&change.membership);
        Some(Payload::config_change(pb_membership))
      },
      EntryPayload::SnapshotPointer(snapshot) => {
        let pb_pointer = SnapshotPointer {
          id: snapshot.id.to_string(),
          membership: MessageField::some(PancakeMembershipConfig::from(&snapshot.membership)),
          ..Default::default()
        };
        Some(Payload::snapshot_pointer(pb_pointer))
      }
    };

    RaftEntry {
      term: e.term,
      index: e.index,
      payload,
      ..Default::default()
    }
  }
}

impl From<AppendEntriesRequest<MutateRequest>> for RaftAppendEntriesRequest {
  fn from(rpc: AppendEntriesRequest<MutateRequest>) -> Self {
    let entries = rpc.entries.iter()
      .map(|e| e.into())
      .collect();

    RaftAppendEntriesRequest {
      term: rpc.term,
      leader_id: rpc.leader_id,
      prev_log_index: rpc.prev_log_index,
      prev_log_term: rpc.prev_log_term,
      leader_commit: rpc.leader_commit,
      entries,
      ..Default::default()
    }
  }
}

impl From<RaftAppendEntriesResponse> for AppendEntriesResponse {
  fn from(resp: RaftAppendEntriesResponse) -> Self {
    let conflict_opt = resp.conflict_op.as_ref().map(|opt|
      ConflictOpt {
        term: opt.term,
        index: opt.index,
      }
    );

    AppendEntriesResponse {
      term: resp.term,
      success: resp.success,
      conflict_opt,
    }
  }
}

impl From<InstallSnapshotRequest> for RaftInstallSnapshotRequest {
  fn from(ar_req: InstallSnapshotRequest) -> Self {
    RaftInstallSnapshotRequest {
      term: ar_req.term,
      leader_id: ar_req.leader_id,
      last_included_index: ar_req.last_included_index,
      last_included_term: ar_req.last_included_term,
      offset: ar_req.offset,
      data: ar_req.data,
      done: ar_req.done,
      ..Default::default()
    }
  }
}

impl From<VoteRequest> for RaftVoteRequest {
  fn from(ar_req: VoteRequest) -> Self {
    RaftVoteRequest {
      term: ar_req.term,
      candidate_id: ar_req.candidate_id,
      last_log_index: ar_req.last_log_index,
      last_log_term: ar_req.last_log_term,
      ..Default::default()
    }
  }
}

impl From<RaftInstallSnapshotResponse> for InstallSnapshotResponse {
  fn from(pancake_resp: RaftInstallSnapshotResponse) -> Self {
    InstallSnapshotResponse {
      term: pancake_resp.term,
    }
  }
}

impl From<RaftVoteResponse> for VoteResponse {
  fn from(pancake_resp: RaftVoteResponse) -> Self {
    VoteResponse {
      term: pancake_resp.term,
      vote_granted: pancake_resp.vote_granted,
    }
  }
}
