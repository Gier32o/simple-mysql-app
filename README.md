## Run
mvn clean package  
docker build -t com.giero/simple-mysql-app:0.0.1 .  
docker-compose up

## Swagger
http://localhost:8080/swagger-ui.html

## Comments
1. Normally I would use Lombok, but it seems there is a problem with Java 16 + Lombok
2. The app requires MySQL database to start, for local environment I would use Test Containers for MySQL mock.
3. I don't feel like I can write any unit tests that would not be just testing if Mockito works correctly. For integration tests, I would use Test Containers as well.
4. When running docker-compose, Spring Boot application restarts few times. It's because database is not ready yet. If restarts are not desirable, I would run some wait-for-db.sh script before running an actual jar.
