FROM openjdk:11
ADD target/api-gateway.jar api-gateway.jar
EXPOSE 8181
ENTRYPOINT ["java", "-jar", "api-gateway.jar"]