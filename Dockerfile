FROM openjdk:17-jdk-slim

WORKDIR /app

COPY src/main/java/com/damiendubost/ /app/com/damiendubost/

RUN javac com/damiendubost/BudgetManager.java

CMD ["java", "com.damiendubost.BudgetManager"]