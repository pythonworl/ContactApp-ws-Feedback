## User Feedback Feature
The latest update to the project introduces the Feedback feature, enhancing our application's user interaction. This feature allows users to submit their feedback, including suggestions, feature requests, and bug reports. 
To use this feature, users simply send a POST request to the /feedback endpoint with their feedback details. Example POST Request and Response: 

## JSON Body Format for POST Request
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
{
    "userId": "12345",    // Include this only if feedback is linked to specific users
    "subject": "Feature Request",
    "message": "I would love to see a new feature that allows..."
}


Further Enhancements: 
In the future, several advancements can be considered for this project for instance:
•	User Authentication Integration: Link feedback to specific user accounts for personalized follow-ups. 
•	Automatic Issue Tracking: Integrate with issue tracking tools to automatically log bugs or feature requests.
•	A good UI can be created which includes a Feedback Form and this can be done using the knowledge of React.
