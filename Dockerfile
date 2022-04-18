FROM openjdk:11-jre-slim

COPY build/libs/eureka-directory-0.1.0-SNAPSHOT.jar home/spring/salcedo_fawcett/discovery_service.jar

EXPOSE 3001

ENTRYPOINT ["java", "-jar", "/home/spring/salcedo_fawcett/discovery_service.jar"]