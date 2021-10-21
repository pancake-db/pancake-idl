use protoc_rust::Codegen;

fn main() {
  Codegen::new()
    .out_dir("src")
    .inputs(&[
      "../protos/dtype.proto",
      "../protos/partition_dtype.proto",
      "../protos/schema.proto",
      "../protos/ddl.proto",
      "../protos/dml.proto",
      "../protos/service.proto",
    ])
    .include("../protos")
    .run()
    .expect("protoc");
}