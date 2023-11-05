FROM openjdk:11:jdk-alpine
EXPOSE 8089
ADD target/*.jar kaddem.jar
ENTRYPOINT ["java","-jar","/kaddem.jar"]
