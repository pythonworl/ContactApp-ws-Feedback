package com.example.contactapp.ui.controller;

import com.example.contactapp.service.FeedbackService;
import com.example.contactapp.shared.dto.FeedbackDto;
import com.example.contactapp.ui.model.request.FeedbackRequestModel;
import com.example.contactapp.ui.model.response.FeedbackResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    @PostMapping
    public ResponseEntity<FeedbackResponseModel> submitFeedback(@RequestBody FeedbackRequestModel feedbackRequestModel) {
        // Convert FeedbackRequestModel to FeedbackDto
        FeedbackDto feedbackDto = new FeedbackDto();
        feedbackDto.setUserId(feedbackRequestModel.getUserId());  // Include this line only if feedback is linked to specific users
        feedbackDto.setSubject(feedbackRequestModel.getSubject());
        feedbackDto.setMessage(feedbackRequestModel.getMessage());

        feedbackService.submitFeedback(feedbackDto);

        // Creating a response model
        FeedbackResponseModel response = new FeedbackResponseModel();
        response.setStatus("success");
        response.setMessage("Feedback received successfully.");

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}


