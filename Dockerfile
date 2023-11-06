FROM openjdk:11
EXPOSE 8082
ADD target/kaddem-5gamix-G3-kaddem-0.1.jar kaddem.jar
ENTRYPOINT ["java","-jar","/kaddem.jar"]
