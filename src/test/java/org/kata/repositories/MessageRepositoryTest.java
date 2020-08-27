package org.kata.socialnetworking.repositories;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;
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

    @Test
    public void findsMessageByUserId() {
        String text = "I love the weather today.";
        Message message = Message.builder().userId(5L).text(text).build();
        Message saved = repository.save(message);
        
        List<Message> found = repository.findByUserId(5L);
        assertEquals(1, found.size());
        assertEquals(text, found.get(0).getText());
    }
}