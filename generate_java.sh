protoc -I protos --java_out java/src/main/java/ \
  protos/ddl.proto \
  protos/dml.proto \
  protos/dtype.proto \
  protos/partition_dtype.proto \
  protos/schema.proto \
  protos/service.proto && \
  cd java && \
  mvn package
