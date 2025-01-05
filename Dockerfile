FROM openjdk:21-jdk
COPY target/D387_sample_code-0.0.2-SNAPSHOT.jar /d387jshort.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/d387jshort.jar"]