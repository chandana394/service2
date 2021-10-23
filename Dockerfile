FROM openjdk
ADD target/service21-0.0.1-SNAPSHOT.jar /
EXPOSE 8084:8084
CMD "java","-jar","service21-0.0.1-SNAPSHOT.jar"]