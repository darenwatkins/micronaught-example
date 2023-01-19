FROM bellsoft/liberica-openjdk-alpine:17.0.5

COPY /target/eurex-merger-0.1.jar /opt/eurex-merger-0.1.jar
#COPY /target/libs /opt/libs

EXPOSE 8443
ENTRYPOINT ["java", "-jar", "/opt/eurex-merger-0.1.jar"]
