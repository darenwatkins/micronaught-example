FROM adoptopenjdk/openjdk11-openj9:jdk-11.0.2.9_openj9-0.12.1-alpine-slim

COPY /target/eurex-merger-0.1.jar /opt/eurex-merger-0.1.jar
#COPY /target/libs /opt/libs

EXPOSE 8443
ENTRYPOINT ["java", "-jar", "/opt/eurex-merger-0.1.jar"]
