package com.example.contactapp.service;

import com.example.contactapp.shared.dto.FeedbackDto;

public interface FeedbackService {
    void submitFeedback(FeedbackDto feedbackDto);
}

