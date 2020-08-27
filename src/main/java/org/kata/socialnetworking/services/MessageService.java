package org.kata.socialnetworking.services;

import org.kata.socialnetworking.models.Message;
import org.kata.socialnetworking.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Autowired
    private MessageRepository repository;

    public void sendMessage(Message message) {
        repository.save(message);
    }
}