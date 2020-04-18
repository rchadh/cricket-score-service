  
FROM openjdk:8
ADD target/cricket-score-service.jar cricket-score-service.jar
EXPOSE 2222
ENTRYPOINT ["java", "-jar", "cricket-score-service.jar"]
