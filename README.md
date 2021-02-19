# Flyway-db-migration

This is an example how to integrate Flyway and Spring Boot application, for data migration.

- Requirements
  Java 1.8 or later.
  PostgreSQL Server 42.x or later.
  Maven 3.x or later.

- Database: PostgresSQL

- Create Postgres database

  create database flyway
  
- Change Postgres username and password as per your configuration

  open src/main/resources/application.properties

  change spring.datasource.username and spring.datasource.password as per your Postgres configuration  
  
 - Execution
   For execute, simply run the command:

   $ mvn clean compile flyway:migrate
   $ mvn clean compile flyway:info
