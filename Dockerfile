FROM openjdk:8-jre-slim
WORKDIR /software-engineering-study-case-contract
COPY target/*.war /software-engineering-study-case-contract/contratacao-0.0.1-SNAPSHOT.war
EXPOSE 9090
CMD java -XX:+UseContainerSupport -Xmx512m -Dserver.port=9090 -jar contratacao-0.0.1-SNAPSHOT.war 

