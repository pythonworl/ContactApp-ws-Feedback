package com.example.contactapp.ui.model.response;

public class FeedbackResponseModel {
    private String status;  // e.g., "success"
    private String message; // e.g., "Feedback received successfully."

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    // Getters and setters
}

