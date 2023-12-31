## USER FEEDBACK FEATURE
The latest update to the project introduces the Feedback feature, enhancing our application's user interaction. This feature allows users to submit their feedback, including suggestions, feature requests, and bug reports. 
To use this feature, users simply send a POST request to the /feedback endpoint with their feedback details. Example POST Request and Response: 

## JSON BODY FORMAT FOR POST REQUEST

User Registration (UserDetailsRequestModel)
{
    "firstName": "John",
    "lastName": "Doe",
    "email": "john.doe@example.com",
    "password": "yourPassword123"
}

User Login (UserLoginRequestModel)
{
    "email": "john.doe@example.com",
    "password": "yourPassword123"
}

Feedback Feature
{
    "userId": "12345",   
    "subject": "Feature Request",
    "message": "I would love to see a new feature that allows..."
}

## DATABASE DETAILS:

spring.datasource.url= jdbc:mysql://localhost:3306/photo_app

spring.datasource.username=root
spring.datasource.password=saw@123

spring.jpa.hibernate.ddl-auto=update

# Server Configuration
server.port=8081
# Logging Configuration
logging.level.org.springframework=INFO

secretToken=skuqwzidtxae62l8rnbj0my5xmy5ec75l337uinixnyal9idxjzxo8fjvuejoash

## Further Enhancements: 
In the future, several advancements can be considered for this project for instance:
•	User Authentication Integration: Link feedback to specific user accounts for personalized follow-ups. 
•	Automatic Issue Tracking: Integrate with issue tracking tools to automatically log bugs or feature requests.
•	A good UI can be created which includes a Feedback Form and this can be done using the knowledge of React.
