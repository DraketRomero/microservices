FROM mcr.microsoft.com/openjdk/jdk:17-ubuntu as base

EXPOSE 8080

ADD target/mircoservices-technical-test-docker.jar mircoservices-technical-test-docker.jar

ENTRYPOINT [ "java", "-jar", "/mircoservices-technical-test-docker.jar" ]