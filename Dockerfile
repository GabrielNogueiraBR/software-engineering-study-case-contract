FROM openjdk:8-jre-slim
WORKDIR /software-engineering-study-case-contract
COPY target/*.jar /software-engineering-study-case-contract/contratacao.jar
EXPOSE 9090
CMD java -XX:+UseContainerSupport -Xmx512m -Dserver.port=9090 -jar contratacao.jar 

