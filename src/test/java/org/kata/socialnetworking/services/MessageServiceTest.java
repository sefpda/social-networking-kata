package org.kata.socialnetworking.services;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.kata.socialnetworking.models.Message;
import org.kata.socialnetworking.repositories.MessageRepository;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class MessageServiceTest {

    @Mock
    private MessageRepository repository;
     
    @InjectMocks
    private MessageService service;

    @Test
    public void sendsMessageToRepository() {
        Message message = Message.builder().userId(2L).text("I had a thought...").build();
        service.sendMessage(message);
        verify(repository).save(message);
    }
}