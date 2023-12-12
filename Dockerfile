FROM bellsoft/liberica-openjdk-alpine-musl:17
VOLUME /tmp
COPY ./build/libs/gradle-greeting-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]