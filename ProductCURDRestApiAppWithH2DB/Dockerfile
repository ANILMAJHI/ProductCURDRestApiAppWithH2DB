FROM openjdk:11
ADD target/ProductCURDRestApiAppWithH2DB-0.0.1-SNAPSHOT.jar spring.jar
EXPOSE 9000
ENTRYPOINT ["java", "-jar", "spring.jar"]
