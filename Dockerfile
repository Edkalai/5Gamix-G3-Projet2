FROM openjdk:8
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} KhaledBenammar-5Gamix-G3-Projet2.jar
ENTRYPOINT ["java","-jar","/KhaledBenammar-5Gamix-G3-Projet2.jar"]
