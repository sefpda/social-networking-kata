package org.kata.socialnetworking.controllers;

import org.kata.socialnetworking.models.Message;
import org.kata.socialnetworking.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {

    @Autowired
    private MessageService service;

	public void createMessage(Message message) {
        service.sendMessage(message);
	}

}
