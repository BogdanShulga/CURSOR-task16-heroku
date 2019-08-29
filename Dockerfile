FROM adoptopenjdk/openjdk11:alpine-jre
WORKDIR /home/app
ADD target/task14_spring_data-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
CMD java -jar app.jar