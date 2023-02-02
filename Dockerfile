FROM openjdk:11
COPY target/*.jar consumer-service.jar
ENTRYPOINT ["java","-jar","/consumer-service.jar"]
EXPOSE 9191