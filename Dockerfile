FROM openjdk:17
COPY target/organicfarmcms-0.0.1-SNAPSHOT.jar organicfarmcms.jar
ENTRYPOINT ["java","-jar","/organicfarmcms.jar"]