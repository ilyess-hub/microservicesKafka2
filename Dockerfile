FROM openjdk:11
COPY target/springkafkaconsumer-0.0.1-SNAPSHOT.jar consumer-service.jar
EXPOSE 9191
RUN bash -c "touch /consumer-service.jar"
ENTRYPOINT ["java","-jar","/consumer-service.jar"]