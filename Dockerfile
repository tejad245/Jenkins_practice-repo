FROM openjdk:8
EXPOSE 8080
ADD target/spring9-0.0.1-SNAPSHOT.jar spring9-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/spring9-0.0.1-SNAPSHOT.jar"]