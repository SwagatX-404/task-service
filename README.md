## TASK SERVICE FOR TASK MANAGEMNET - MICROSERVICE 2



## Database Configuration 
- [application.yaml] file
```bash 
server:
  port: 5002

spring:
  application:
    name: TASK-SERVICE

  jpa:
    hibernate.ddl-auto: update
  datasource:
    url: jdbc:mysql://${MYSQL_HOST:localhost}:3306/db_task_service
    username: root
    password: your_password
    driver-class-name: com.mysql.cj.jdbc.Driver
```