package org.kata.socialnetworking.repositories;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.kata.socialnetworking.models.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class MessageRepositoryTest {
    
    @Autowired
    private MessageRepository repository;

    @Test
    public void savesMessage() {
        Message message = Message.builder().build();
        Message saved = repository.save(message);
        assertNotNull(saved.getId());
    }
}