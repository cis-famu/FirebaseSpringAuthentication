# Firebase Spring Authentication
 
 This repository includes all the files required to setup email and password authentication using Firebase and Spring.
 It uses sessions for the front end. The Bearer token must be passed for REST calls.
 
 ## Add dependcies
 ```xml
    <dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-security</artifactId>
	</dependency>
 ```
 
 ## Update application.yml
 
 In this file, remember to put in your application name at line 8.
 
 ### Update you public URIs
 
 The yml files lists the public URIs that can be accessed without authentication. Update this list as needed for your project.
