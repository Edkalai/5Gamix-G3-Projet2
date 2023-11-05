FROM openjdk:11
EXPOSE 8082
ADD target/kaddem-SNAPSHOT-0.1.jar kaddem.jar
ENTRYPOINT ["java","-jar","/kaddem.jar"]
