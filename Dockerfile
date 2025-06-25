FROM openjdk:17
EXPOSE 9000
ADD target/ApiGateway-0.0.1-SNAPSHOT.jar gateway.jar
ENTRYPOINT ["java","-jar","gateway.jar"]
