FROM openjdk:11
RUN echo "Building Docker for Interviewportal"
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} portal.jar
ENTRYPOINT ["java","-Xms512m","-Xmx2048m","-XX:+UseStringDeduplication","-jar","/portal.jar"]