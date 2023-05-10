# spring-jpa

Clone the GIT repo and import.

Install Postgres 11 - https://www.enterprisedb.com/downloads/postgres-postgresql-downloads

Run sql.sql from queries folder in postgres db.

Change postgres username or password or port accordingly in application properties.

Run Spring application by triggering BaseApplication.java

Go to postman and hit the URL with below payload. Then check database

API: http://localhost:8080/create/user/v2

Request Body: 

 {
      "firstName": "John",
      "lastName": "Dee",
      "name": "John Dee",
      "address": {
        "billing_address_st1": "Bill St.",
        "billing_address_st2": "Dr Avenue",
        "billing_address_zip": "TX001",
        "delivery_address_st1": "Bill St.",
        "delivery_address_st2": "Dr Avenue",
        "delivery_address_zip": "TX001"
      }
  }
  
Then validate DB.

