FROM openjdk:8-jdk-alpine
LABEL maintainer="author@javatodev.com"
VOLUME /main-app
ADD build/libs/dockerize-spring-boot-application-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar","/app.jar"]