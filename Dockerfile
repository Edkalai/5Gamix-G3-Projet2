FROM openjdk:11-jre-slim
EXPOSE 8089
ADD target/*.jar 5Gamix-G3-Kaddem.jar
ENTRYPOINT ["java","-jar","/5Gamix-G3-Kaddem.jar"]
