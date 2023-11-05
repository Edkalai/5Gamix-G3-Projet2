FROM openjdk:8
EXPOSE 8089
ADD target/kaddem-0.0.1-SNAPSHOT.jar kaddem
ENTRYPOINT ["java","-jar","/kaddem-0.0.1-SNAPSHOT.jar"]
