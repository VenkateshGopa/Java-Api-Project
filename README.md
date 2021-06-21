# Java-Api-Project

CRUD-API-using-java-spring-boot
This exercise explains CRUD (Create, Read, Update, Delete) operations using spring boot and H2 in-memory database and also using Spring Data JPA (CRUDRepository) for built-in methods to do CRUD operations.

The app defines following CRUD APIs.

POST - http://localhost:8080/contacts/add (To add contacts)

GET - http://localhost:8080/contacts (Get all contacts)

GET - http://localhost:8080/contacts/{number} (Get contacts by number)

PUT - http://localhost:8080/contacts/update (to update contacts)

DELETE - http://localhost:8080/contacts/delete/{number}(To delete contact)

I have created schema.sql, data.sql in the resources. In schema.sql file i have written sql query to created table . In data.sql file i have inserted some data to test the project.
