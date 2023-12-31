package com.example.contactapp.io;

import com.example.contactapp.io.entity.FeedbackEntity;
import org.springframework.data.repository.CrudRepository;

public interface FeedbackRepository extends CrudRepository<FeedbackEntity, Long> {
}

