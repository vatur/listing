
To test this application should:
- run TestApplication (under Spring Boot configuration)
while the application is started, the data will be uploaded to DB from CSV file (only in the case of the table in the DB is empty) 
- send request via browser with values of parameters like:
http://localhost:8080/listing?min_price=0.0081&max_price=0.15&min_min_cpm=1&max_min_cpm=2