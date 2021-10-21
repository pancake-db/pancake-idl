protoc -I protos --java_out java/src/main/java/ protos/*.proto && \
  cd java && \
  mvn package
