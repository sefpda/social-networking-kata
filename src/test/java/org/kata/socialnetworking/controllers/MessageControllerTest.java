package org.kata.socialnetworking.controllers;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.kata.socialnetworking.models.Message;
import org.kata.socialnetworking.services.MessageService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class MessageControllerTest {

    @InjectMocks
    private MessageController controller;

    @Mock
    private MessageService service;
    
    @Test
    public void createMessage() {
        Message message = Message.builder().build();
        controller.createMessage(message);
        verify(service).sendMessage(message);
    }
}
