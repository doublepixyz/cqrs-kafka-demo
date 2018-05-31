FROM java:8
LABEL maintainer=“pizhigang@huawei.com”
VOLUME /tmp
EXPOSE 8080
ADD target/cqrs-kafka-demo-consumer-storage-0.0.1-SNAPSHOT.jar cqrs-kafka-demo-consumer-storage-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","cqrs-kafka-demo-consumer-storage-0.0.1-SNAPSHOT.jar"]