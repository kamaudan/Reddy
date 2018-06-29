
#Reddy: Redis and Spring framework
This application is a CRUD(Create, Read, Update and Delete) application, written using using Java language, spring  framework, 
 Jedis: Redis database connector, and Redis database.
 
 Quick intro:
 
 Redis(REmote DIrectory Server) is a database server that stores data in memory and also it can store in disk. 
 Mostly is used as a cache in many online services such as netflix. It stores data in form of 
 data structures such as hash, set etc. It written in C programming language; that means it 
 runs on bare metal; thats why it is so fast.
 
 In this application am using it as a normal database as I would use; Apache Cassandra or PostgreSQL.
 
 Other tools:
  It is written in Java and  Spring framework.
  
  
  Api endpoints are:
  
  locahost:8082/add/{id}/{name}  save a user.
  
  localhost: 8082//update/{id}/{name} to update a user
  
  locahost:8082/all to get all users
  
  locahost:8082/delete/{id}
  
  
 