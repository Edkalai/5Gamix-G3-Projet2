FROM openjdk:8
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} khaledbenammar-5gamix-g3-projet2.jar
ENTRYPOINT ["java","-jar","/khaledbenammar-5gamix-g3-projet2.jar"]
