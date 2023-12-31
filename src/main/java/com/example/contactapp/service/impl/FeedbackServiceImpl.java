package com.example.contactapp.service.impl;

import com.example.contactapp.io.FeedbackRepository;
import com.example.contactapp.io.entity.FeedbackEntity;
import com.example.contactapp.service.FeedbackService;
import com.example.contactapp.shared.dto.FeedbackDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class FeedbackServiceImpl implements FeedbackService {

    @Autowired
    FeedbackRepository feedbackRepository;

    @Override
    public void submitFeedback(FeedbackDto feedbackDto) {
        FeedbackEntity feedbackEntity = new FeedbackEntity();
        feedbackEntity.setUserId(feedbackDto.getUserId());
        feedbackEntity.setSubject(feedbackDto.getSubject());
        feedbackEntity.setMessage(feedbackDto.getMessage());
        feedbackEntity.setCreatedAt(new Date());

        feedbackRepository.save(feedbackEntity);
    }
}

