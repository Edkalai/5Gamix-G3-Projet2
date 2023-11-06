FROM openjdk:8
EXPOSE 8089
ADD target/kaddem-SNAPSHOT-01.jar /kaddem.jar
ENTRYPOINT ["java","-jar","/kaddem.jar"]