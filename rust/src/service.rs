#[doc = r" Generated client implementations."]
pub mod pancake_db_client {
    #![allow(unused_variables, dead_code, missing_docs, clippy::let_unit_value)]
    use tonic::codegen::*;
    #[derive(Debug, Clone)]
    pub struct PancakeDbClient<T> {
        inner: tonic::client::Grpc<T>,
    }
    impl PancakeDbClient<tonic::transport::Channel> {
        #[doc = r" Attempt to create a new client by connecting to a given endpoint."]
        pub async fn connect<D>(dst: D) -> Result<Self, tonic::transport::Error>
        where
            D: std::convert::TryInto<tonic::transport::Endpoint>,
            D::Error: Into<StdError>,
        {
            let conn = tonic::transport::Endpoint::new(dst)?.connect().await?;
            Ok(Self::new(conn))
        }
    }
    impl<T> PancakeDbClient<T>
    where
        T: tonic::client::GrpcService<tonic::body::BoxBody>,
        T::ResponseBody: Body + Send + 'static,
        T::Error: Into<StdError>,
        <T::ResponseBody as Body>::Error: Into<StdError> + Send,
    {
        pub fn new(inner: T) -> Self {
            let inner = tonic::client::Grpc::new(inner);
            Self { inner }
        }
        pub fn with_interceptor<F>(
            inner: T,
            interceptor: F,
        ) -> PancakeDbClient<InterceptedService<T, F>>
        where
            F: tonic::service::Interceptor,
            T: tonic::codegen::Service<
                http::Request<tonic::body::BoxBody>,
                Response = http::Response<
                    <T as tonic::client::GrpcService<tonic::body::BoxBody>>::ResponseBody,
                >,
            >,
            <T as tonic::codegen::Service<http::Request<tonic::body::BoxBody>>>::Error:
                Into<StdError> + Send + Sync,
        {
            PancakeDbClient::new(InterceptedService::new(inner, interceptor))
        }
        #[doc = r" Compress requests with `gzip`."]
        #[doc = r""]
        #[doc = r" This requires the server to support it otherwise it might respond with an"]
        #[doc = r" error."]
        pub fn send_gzip(mut self) -> Self {
            self.inner = self.inner.send_gzip();
            self
        }
        #[doc = r" Enable decompressing responses with `gzip`."]
        pub fn accept_gzip(mut self) -> Self {
            self.inner = self.inner.accept_gzip();
            self
        }
        pub async fn alter_table(
            &mut self,
            request: impl tonic::IntoRequest<super::super::ddl::AlterTableRequest>,
        ) -> Result<tonic::Response<super::super::ddl::AlterTableResponse>, tonic::Status> {
            self.inner.ready().await.map_err(|e| {
                tonic::Status::new(
                    tonic::Code::Unknown,
                    format!("Service was not ready: {}", e.into()),
                )
            })?;
            let codec = tonic::codec::ProstCodec::default();
            let path = http::uri::PathAndQuery::from_static("/service.PancakeDb/AlterTable");
            self.inner.unary(request.into_request(), path, codec).await
        }
        pub async fn create_table(
            &mut self,
            request: impl tonic::IntoRequest<super::super::ddl::CreateTableRequest>,
        ) -> Result<tonic::Response<super::super::ddl::CreateTableResponse>, tonic::Status>
        {
            self.inner.ready().await.map_err(|e| {
                tonic::Status::new(
                    tonic::Code::Unknown,
                    format!("Service was not ready: {}", e.into()),
                )
            })?;
            let codec = tonic::codec::ProstCodec::default();
            let path = http::uri::PathAndQuery::from_static("/service.PancakeDb/CreateTable");
            self.inner.unary(request.into_request(), path, codec).await
        }
        pub async fn drop_table(
            &mut self,
            request: impl tonic::IntoRequest<super::super::ddl::DropTableRequest>,
        ) -> Result<tonic::Response<super::super::ddl::DropTableResponse>, tonic::Status> {
            self.inner.ready().await.map_err(|e| {
                tonic::Status::new(
                    tonic::Code::Unknown,
                    format!("Service was not ready: {}", e.into()),
                )
            })?;
            let codec = tonic::codec::ProstCodec::default();
            let path = http::uri::PathAndQuery::from_static("/service.PancakeDb/DropTable");
            self.inner.unary(request.into_request(), path, codec).await
        }
        pub async fn get_schema(
            &mut self,
            request: impl tonic::IntoRequest<super::super::ddl::GetSchemaRequest>,
        ) -> Result<tonic::Response<super::super::ddl::GetSchemaResponse>, tonic::Status> {
            self.inner.ready().await.map_err(|e| {
                tonic::Status::new(
                    tonic::Code::Unknown,
                    format!("Service was not ready: {}", e.into()),
                )
            })?;
            let codec = tonic::codec::ProstCodec::default();
            let path = http::uri::PathAndQuery::from_static("/service.PancakeDb/GetSchema");
            self.inner.unary(request.into_request(), path, codec).await
        }
        pub async fn list_tables(
            &mut self,
            request: impl tonic::IntoRequest<super::super::ddl::ListTablesRequest>,
        ) -> Result<tonic::Response<super::super::ddl::ListTablesResponse>, tonic::Status> {
            self.inner.ready().await.map_err(|e| {
                tonic::Status::new(
                    tonic::Code::Unknown,
                    format!("Service was not ready: {}", e.into()),
                )
            })?;
            let codec = tonic::codec::ProstCodec::default();
            let path = http::uri::PathAndQuery::from_static("/service.PancakeDb/ListTables");
            self.inner.unary(request.into_request(), path, codec).await
        }
        pub async fn delete_from_segment(
            &mut self,
            request: impl tonic::IntoRequest<super::super::dml::DeleteFromSegmentRequest>,
        ) -> Result<tonic::Response<super::super::dml::DeleteFromSegmentResponse>, tonic::Status>
        {
            self.inner.ready().await.map_err(|e| {
                tonic::Status::new(
                    tonic::Code::Unknown,
                    format!("Service was not ready: {}", e.into()),
                )
            })?;
            let codec = tonic::codec::ProstCodec::default();
            let path = http::uri::PathAndQuery::from_static("/service.PancakeDb/DeleteFromSegment");
            self.inner.unary(request.into_request(), path, codec).await
        }
        pub async fn list_segments(
            &mut self,
            request: impl tonic::IntoRequest<super::super::dml::ListSegmentsRequest>,
        ) -> Result<tonic::Response<super::super::dml::ListSegmentsResponse>, tonic::Status>
        {
            self.inner.ready().await.map_err(|e| {
                tonic::Status::new(
                    tonic::Code::Unknown,
                    format!("Service was not ready: {}", e.into()),
                )
            })?;
            let codec = tonic::codec::ProstCodec::default();
            let path = http::uri::PathAndQuery::from_static("/service.PancakeDb/ListSegments");
            self.inner.unary(request.into_request(), path, codec).await
        }
        pub async fn read_segment_column(
            &mut self,
            request: impl tonic::IntoRequest<super::super::dml::ReadSegmentColumnRequest>,
        ) -> Result<
            tonic::Response<tonic::codec::Streaming<super::super::dml::ReadSegmentColumnResponse>>,
            tonic::Status,
        > {
            self.inner.ready().await.map_err(|e| {
                tonic::Status::new(
                    tonic::Code::Unknown,
                    format!("Service was not ready: {}", e.into()),
                )
            })?;
            let codec = tonic::codec::ProstCodec::default();
            let path = http::uri::PathAndQuery::from_static("/service.PancakeDb/ReadSegmentColumn");
            self.inner
                .server_streaming(request.into_request(), path, codec)
                .await
        }
        pub async fn read_segment_deletions(
            &mut self,
            request: impl tonic::IntoRequest<super::super::dml::ReadSegmentDeletionsRequest>,
        ) -> Result<tonic::Response<super::super::dml::ReadSegmentDeletionsResponse>, tonic::Status>
        {
            self.inner.ready().await.map_err(|e| {
                tonic::Status::new(
                    tonic::Code::Unknown,
                    format!("Service was not ready: {}", e.into()),
                )
            })?;
            let codec = tonic::codec::ProstCodec::default();
            let path =
                http::uri::PathAndQuery::from_static("/service.PancakeDb/ReadSegmentDeletions");
            self.inner.unary(request.into_request(), path, codec).await
        }
        pub async fn write_to_partition(
            &mut self,
            request: impl tonic::IntoRequest<super::super::dml::WriteToPartitionRequest>,
        ) -> Result<tonic::Response<super::super::dml::WriteToPartitionResponse>, tonic::Status>
        {
            self.inner.ready().await.map_err(|e| {
                tonic::Status::new(
                    tonic::Code::Unknown,
                    format!("Service was not ready: {}", e.into()),
                )
            })?;
            let codec = tonic::codec::ProstCodec::default();
            let path = http::uri::PathAndQuery::from_static("/service.PancakeDb/WriteToPartition");
            self.inner.unary(request.into_request(), path, codec).await
        }
    }
}
#[doc = r" Generated server implementations."]
pub mod pancake_db_server {
    #![allow(unused_variables, dead_code, missing_docs, clippy::let_unit_value)]
    use tonic::codegen::*;
    #[doc = "Generated trait containing gRPC methods that should be implemented for use with PancakeDbServer."]
    #[async_trait]
    pub trait PancakeDb: Send + Sync + 'static {
        async fn alter_table(
            &self,
            request: tonic::Request<super::super::ddl::AlterTableRequest>,
        ) -> Result<tonic::Response<super::super::ddl::AlterTableResponse>, tonic::Status>;
        async fn create_table(
            &self,
            request: tonic::Request<super::super::ddl::CreateTableRequest>,
        ) -> Result<tonic::Response<super::super::ddl::CreateTableResponse>, tonic::Status>;
        async fn drop_table(
            &self,
            request: tonic::Request<super::super::ddl::DropTableRequest>,
        ) -> Result<tonic::Response<super::super::ddl::DropTableResponse>, tonic::Status>;
        async fn get_schema(
            &self,
            request: tonic::Request<super::super::ddl::GetSchemaRequest>,
        ) -> Result<tonic::Response<super::super::ddl::GetSchemaResponse>, tonic::Status>;
        async fn list_tables(
            &self,
            request: tonic::Request<super::super::ddl::ListTablesRequest>,
        ) -> Result<tonic::Response<super::super::ddl::ListTablesResponse>, tonic::Status>;
        async fn delete_from_segment(
            &self,
            request: tonic::Request<super::super::dml::DeleteFromSegmentRequest>,
        ) -> Result<tonic::Response<super::super::dml::DeleteFromSegmentResponse>, tonic::Status>;
        async fn list_segments(
            &self,
            request: tonic::Request<super::super::dml::ListSegmentsRequest>,
        ) -> Result<tonic::Response<super::super::dml::ListSegmentsResponse>, tonic::Status>;
        #[doc = "Server streaming response type for the ReadSegmentColumn method."]
        type ReadSegmentColumnStream: futures_core::Stream<
                Item = Result<super::super::dml::ReadSegmentColumnResponse, tonic::Status>,
            > + Send
            + 'static;
        async fn read_segment_column(
            &self,
            request: tonic::Request<super::super::dml::ReadSegmentColumnRequest>,
        ) -> Result<tonic::Response<Self::ReadSegmentColumnStream>, tonic::Status>;
        async fn read_segment_deletions(
            &self,
            request: tonic::Request<super::super::dml::ReadSegmentDeletionsRequest>,
        ) -> Result<tonic::Response<super::super::dml::ReadSegmentDeletionsResponse>, tonic::Status>;
        async fn write_to_partition(
            &self,
            request: tonic::Request<super::super::dml::WriteToPartitionRequest>,
        ) -> Result<tonic::Response<super::super::dml::WriteToPartitionResponse>, tonic::Status>;
    }
    #[derive(Debug)]
    pub struct PancakeDbServer<T: PancakeDb> {
        inner: _Inner<T>,
        accept_compression_encodings: (),
        send_compression_encodings: (),
    }
    struct _Inner<T>(Arc<T>);
    impl<T: PancakeDb> PancakeDbServer<T> {
        pub fn new(inner: T) -> Self {
            let inner = Arc::new(inner);
            let inner = _Inner(inner);
            Self {
                inner,
                accept_compression_encodings: Default::default(),
                send_compression_encodings: Default::default(),
            }
        }
        pub fn with_interceptor<F>(inner: T, interceptor: F) -> InterceptedService<Self, F>
        where
            F: tonic::service::Interceptor,
        {
            InterceptedService::new(Self::new(inner), interceptor)
        }
    }
    impl<T, B> tonic::codegen::Service<http::Request<B>> for PancakeDbServer<T>
    where
        T: PancakeDb,
        B: Body + Send + 'static,
        B::Error: Into<StdError> + Send + 'static,
    {
        type Response = http::Response<tonic::body::BoxBody>;
        type Error = Never;
        type Future = BoxFuture<Self::Response, Self::Error>;
        fn poll_ready(&mut self, _cx: &mut Context<'_>) -> Poll<Result<(), Self::Error>> {
            Poll::Ready(Ok(()))
        }
        fn call(&mut self, req: http::Request<B>) -> Self::Future {
            let inner = self.inner.clone();
            match req.uri().path() {
                "/service.PancakeDb/AlterTable" => {
                    #[allow(non_camel_case_types)]
                    struct AlterTableSvc<T: PancakeDb>(pub Arc<T>);
                    impl<T: PancakeDb>
                        tonic::server::UnaryService<super::super::ddl::AlterTableRequest>
                        for AlterTableSvc<T>
                    {
                        type Response = super::super::ddl::AlterTableResponse;
                        type Future = BoxFuture<tonic::Response<Self::Response>, tonic::Status>;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::super::ddl::AlterTableRequest>,
                        ) -> Self::Future {
                            let inner = self.0.clone();
                            let fut = async move { (*inner).alter_table(request).await };
                            Box::pin(fut)
                        }
                    }
                    let accept_compression_encodings = self.accept_compression_encodings;
                    let send_compression_encodings = self.send_compression_encodings;
                    let inner = self.inner.clone();
                    let fut = async move {
                        let inner = inner.0;
                        let method = AlterTableSvc(inner);
                        let codec = tonic::codec::ProstCodec::default();
                        let mut grpc = tonic::server::Grpc::new(codec).apply_compression_config(
                            accept_compression_encodings,
                            send_compression_encodings,
                        );
                        let res = grpc.unary(method, req).await;
                        Ok(res)
                    };
                    Box::pin(fut)
                }
                "/service.PancakeDb/CreateTable" => {
                    #[allow(non_camel_case_types)]
                    struct CreateTableSvc<T: PancakeDb>(pub Arc<T>);
                    impl<T: PancakeDb>
                        tonic::server::UnaryService<super::super::ddl::CreateTableRequest>
                        for CreateTableSvc<T>
                    {
                        type Response = super::super::ddl::CreateTableResponse;
                        type Future = BoxFuture<tonic::Response<Self::Response>, tonic::Status>;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::super::ddl::CreateTableRequest>,
                        ) -> Self::Future {
                            let inner = self.0.clone();
                            let fut = async move { (*inner).create_table(request).await };
                            Box::pin(fut)
                        }
                    }
                    let accept_compression_encodings = self.accept_compression_encodings;
                    let send_compression_encodings = self.send_compression_encodings;
                    let inner = self.inner.clone();
                    let fut = async move {
                        let inner = inner.0;
                        let method = CreateTableSvc(inner);
                        let codec = tonic::codec::ProstCodec::default();
                        let mut grpc = tonic::server::Grpc::new(codec).apply_compression_config(
                            accept_compression_encodings,
                            send_compression_encodings,
                        );
                        let res = grpc.unary(method, req).await;
                        Ok(res)
                    };
                    Box::pin(fut)
                }
                "/service.PancakeDb/DropTable" => {
                    #[allow(non_camel_case_types)]
                    struct DropTableSvc<T: PancakeDb>(pub Arc<T>);
                    impl<T: PancakeDb>
                        tonic::server::UnaryService<super::super::ddl::DropTableRequest>
                        for DropTableSvc<T>
                    {
                        type Response = super::super::ddl::DropTableResponse;
                        type Future = BoxFuture<tonic::Response<Self::Response>, tonic::Status>;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::super::ddl::DropTableRequest>,
                        ) -> Self::Future {
                            let inner = self.0.clone();
                            let fut = async move { (*inner).drop_table(request).await };
                            Box::pin(fut)
                        }
                    }
                    let accept_compression_encodings = self.accept_compression_encodings;
                    let send_compression_encodings = self.send_compression_encodings;
                    let inner = self.inner.clone();
                    let fut = async move {
                        let inner = inner.0;
                        let method = DropTableSvc(inner);
                        let codec = tonic::codec::ProstCodec::default();
                        let mut grpc = tonic::server::Grpc::new(codec).apply_compression_config(
                            accept_compression_encodings,
                            send_compression_encodings,
                        );
                        let res = grpc.unary(method, req).await;
                        Ok(res)
                    };
                    Box::pin(fut)
                }
                "/service.PancakeDb/GetSchema" => {
                    #[allow(non_camel_case_types)]
                    struct GetSchemaSvc<T: PancakeDb>(pub Arc<T>);
                    impl<T: PancakeDb>
                        tonic::server::UnaryService<super::super::ddl::GetSchemaRequest>
                        for GetSchemaSvc<T>
                    {
                        type Response = super::super::ddl::GetSchemaResponse;
                        type Future = BoxFuture<tonic::Response<Self::Response>, tonic::Status>;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::super::ddl::GetSchemaRequest>,
                        ) -> Self::Future {
                            let inner = self.0.clone();
                            let fut = async move { (*inner).get_schema(request).await };
                            Box::pin(fut)
                        }
                    }
                    let accept_compression_encodings = self.accept_compression_encodings;
                    let send_compression_encodings = self.send_compression_encodings;
                    let inner = self.inner.clone();
                    let fut = async move {
                        let inner = inner.0;
                        let method = GetSchemaSvc(inner);
                        let codec = tonic::codec::ProstCodec::default();
                        let mut grpc = tonic::server::Grpc::new(codec).apply_compression_config(
                            accept_compression_encodings,
                            send_compression_encodings,
                        );
                        let res = grpc.unary(method, req).await;
                        Ok(res)
                    };
                    Box::pin(fut)
                }
                "/service.PancakeDb/ListTables" => {
                    #[allow(non_camel_case_types)]
                    struct ListTablesSvc<T: PancakeDb>(pub Arc<T>);
                    impl<T: PancakeDb>
                        tonic::server::UnaryService<super::super::ddl::ListTablesRequest>
                        for ListTablesSvc<T>
                    {
                        type Response = super::super::ddl::ListTablesResponse;
                        type Future = BoxFuture<tonic::Response<Self::Response>, tonic::Status>;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::super::ddl::ListTablesRequest>,
                        ) -> Self::Future {
                            let inner = self.0.clone();
                            let fut = async move { (*inner).list_tables(request).await };
                            Box::pin(fut)
                        }
                    }
                    let accept_compression_encodings = self.accept_compression_encodings;
                    let send_compression_encodings = self.send_compression_encodings;
                    let inner = self.inner.clone();
                    let fut = async move {
                        let inner = inner.0;
                        let method = ListTablesSvc(inner);
                        let codec = tonic::codec::ProstCodec::default();
                        let mut grpc = tonic::server::Grpc::new(codec).apply_compression_config(
                            accept_compression_encodings,
                            send_compression_encodings,
                        );
                        let res = grpc.unary(method, req).await;
                        Ok(res)
                    };
                    Box::pin(fut)
                }
                "/service.PancakeDb/DeleteFromSegment" => {
                    #[allow(non_camel_case_types)]
                    struct DeleteFromSegmentSvc<T: PancakeDb>(pub Arc<T>);
                    impl<T: PancakeDb>
                        tonic::server::UnaryService<super::super::dml::DeleteFromSegmentRequest>
                        for DeleteFromSegmentSvc<T>
                    {
                        type Response = super::super::dml::DeleteFromSegmentResponse;
                        type Future = BoxFuture<tonic::Response<Self::Response>, tonic::Status>;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::super::dml::DeleteFromSegmentRequest>,
                        ) -> Self::Future {
                            let inner = self.0.clone();
                            let fut = async move { (*inner).delete_from_segment(request).await };
                            Box::pin(fut)
                        }
                    }
                    let accept_compression_encodings = self.accept_compression_encodings;
                    let send_compression_encodings = self.send_compression_encodings;
                    let inner = self.inner.clone();
                    let fut = async move {
                        let inner = inner.0;
                        let method = DeleteFromSegmentSvc(inner);
                        let codec = tonic::codec::ProstCodec::default();
                        let mut grpc = tonic::server::Grpc::new(codec).apply_compression_config(
                            accept_compression_encodings,
                            send_compression_encodings,
                        );
                        let res = grpc.unary(method, req).await;
                        Ok(res)
                    };
                    Box::pin(fut)
                }
                "/service.PancakeDb/ListSegments" => {
                    #[allow(non_camel_case_types)]
                    struct ListSegmentsSvc<T: PancakeDb>(pub Arc<T>);
                    impl<T: PancakeDb>
                        tonic::server::UnaryService<super::super::dml::ListSegmentsRequest>
                        for ListSegmentsSvc<T>
                    {
                        type Response = super::super::dml::ListSegmentsResponse;
                        type Future = BoxFuture<tonic::Response<Self::Response>, tonic::Status>;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::super::dml::ListSegmentsRequest>,
                        ) -> Self::Future {
                            let inner = self.0.clone();
                            let fut = async move { (*inner).list_segments(request).await };
                            Box::pin(fut)
                        }
                    }
                    let accept_compression_encodings = self.accept_compression_encodings;
                    let send_compression_encodings = self.send_compression_encodings;
                    let inner = self.inner.clone();
                    let fut = async move {
                        let inner = inner.0;
                        let method = ListSegmentsSvc(inner);
                        let codec = tonic::codec::ProstCodec::default();
                        let mut grpc = tonic::server::Grpc::new(codec).apply_compression_config(
                            accept_compression_encodings,
                            send_compression_encodings,
                        );
                        let res = grpc.unary(method, req).await;
                        Ok(res)
                    };
                    Box::pin(fut)
                }
                "/service.PancakeDb/ReadSegmentColumn" => {
                    #[allow(non_camel_case_types)]
                    struct ReadSegmentColumnSvc<T: PancakeDb>(pub Arc<T>);
                    impl<T: PancakeDb>
                        tonic::server::ServerStreamingService<
                            super::super::dml::ReadSegmentColumnRequest,
                        > for ReadSegmentColumnSvc<T>
                    {
                        type Response = super::super::dml::ReadSegmentColumnResponse;
                        type ResponseStream = T::ReadSegmentColumnStream;
                        type Future =
                            BoxFuture<tonic::Response<Self::ResponseStream>, tonic::Status>;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::super::dml::ReadSegmentColumnRequest>,
                        ) -> Self::Future {
                            let inner = self.0.clone();
                            let fut = async move { (*inner).read_segment_column(request).await };
                            Box::pin(fut)
                        }
                    }
                    let accept_compression_encodings = self.accept_compression_encodings;
                    let send_compression_encodings = self.send_compression_encodings;
                    let inner = self.inner.clone();
                    let fut = async move {
                        let inner = inner.0;
                        let method = ReadSegmentColumnSvc(inner);
                        let codec = tonic::codec::ProstCodec::default();
                        let mut grpc = tonic::server::Grpc::new(codec).apply_compression_config(
                            accept_compression_encodings,
                            send_compression_encodings,
                        );
                        let res = grpc.server_streaming(method, req).await;
                        Ok(res)
                    };
                    Box::pin(fut)
                }
                "/service.PancakeDb/ReadSegmentDeletions" => {
                    #[allow(non_camel_case_types)]
                    struct ReadSegmentDeletionsSvc<T: PancakeDb>(pub Arc<T>);
                    impl<T: PancakeDb>
                        tonic::server::UnaryService<super::super::dml::ReadSegmentDeletionsRequest>
                        for ReadSegmentDeletionsSvc<T>
                    {
                        type Response = super::super::dml::ReadSegmentDeletionsResponse;
                        type Future = BoxFuture<tonic::Response<Self::Response>, tonic::Status>;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::super::dml::ReadSegmentDeletionsRequest>,
                        ) -> Self::Future {
                            let inner = self.0.clone();
                            let fut = async move { (*inner).read_segment_deletions(request).await };
                            Box::pin(fut)
                        }
                    }
                    let accept_compression_encodings = self.accept_compression_encodings;
                    let send_compression_encodings = self.send_compression_encodings;
                    let inner = self.inner.clone();
                    let fut = async move {
                        let inner = inner.0;
                        let method = ReadSegmentDeletionsSvc(inner);
                        let codec = tonic::codec::ProstCodec::default();
                        let mut grpc = tonic::server::Grpc::new(codec).apply_compression_config(
                            accept_compression_encodings,
                            send_compression_encodings,
                        );
                        let res = grpc.unary(method, req).await;
                        Ok(res)
                    };
                    Box::pin(fut)
                }
                "/service.PancakeDb/WriteToPartition" => {
                    #[allow(non_camel_case_types)]
                    struct WriteToPartitionSvc<T: PancakeDb>(pub Arc<T>);
                    impl<T: PancakeDb>
                        tonic::server::UnaryService<super::super::dml::WriteToPartitionRequest>
                        for WriteToPartitionSvc<T>
                    {
                        type Response = super::super::dml::WriteToPartitionResponse;
                        type Future = BoxFuture<tonic::Response<Self::Response>, tonic::Status>;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::super::dml::WriteToPartitionRequest>,
                        ) -> Self::Future {
                            let inner = self.0.clone();
                            let fut = async move { (*inner).write_to_partition(request).await };
                            Box::pin(fut)
                        }
                    }
                    let accept_compression_encodings = self.accept_compression_encodings;
                    let send_compression_encodings = self.send_compression_encodings;
                    let inner = self.inner.clone();
                    let fut = async move {
                        let inner = inner.0;
                        let method = WriteToPartitionSvc(inner);
                        let codec = tonic::codec::ProstCodec::default();
                        let mut grpc = tonic::server::Grpc::new(codec).apply_compression_config(
                            accept_compression_encodings,
                            send_compression_encodings,
                        );
                        let res = grpc.unary(method, req).await;
                        Ok(res)
                    };
                    Box::pin(fut)
                }
                _ => Box::pin(async move {
                    Ok(http::Response::builder()
                        .status(200)
                        .header("grpc-status", "12")
                        .header("content-type", "application/grpc")
                        .body(empty_body())
                        .unwrap())
                }),
            }
        }
    }
    impl<T: PancakeDb> Clone for PancakeDbServer<T> {
        fn clone(&self) -> Self {
            let inner = self.inner.clone();
            Self {
                inner,
                accept_compression_encodings: self.accept_compression_encodings,
                send_compression_encodings: self.send_compression_encodings,
            }
        }
    }
    impl<T: PancakeDb> Clone for _Inner<T> {
        fn clone(&self) -> Self {
            Self(self.0.clone())
        }
    }
    impl<T: std::fmt::Debug> std::fmt::Debug for _Inner<T> {
        fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
            write!(f, "{:?}", self.0)
        }
    }
    impl<T: PancakeDb> tonic::transport::NamedService for PancakeDbServer<T> {
        const NAME: &'static str = "service.PancakeDb";
    }
}
