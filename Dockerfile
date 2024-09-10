FROM openjdk:8
EXPOSE 8080
ADD target/spring9.jar spring9.jar
ENTRYPOINT ["java","-jar","spring9.jar"]