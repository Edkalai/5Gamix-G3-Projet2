FROM openjdk:11-jre-alpine
EXPOSE 8089
ADD target/*.jar kaddem.jar
ENTRYPOINT ["java","-jar","/kaddem.jar"]
