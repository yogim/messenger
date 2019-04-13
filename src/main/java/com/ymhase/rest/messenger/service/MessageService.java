package com.ymhase.rest.messenger.service;

import java.util.ArrayList;
import java.util.List;

import com.ymhase.rest.messenger.model.Message;

public class MessageService {

    List<Message> messageList = null;

    public MessageService() {

	messageList = new ArrayList<>();
	messageList.add(new Message(1, "hello", "today", "Yogesh"));

	messageList.add(new Message(2, "hello", "today", "Yogesh"));

    }

    public Message getMessage(int id) {

	if (messageList.get(id) == null) {
	    return null;

	}

	return messageList.get(id);

    }

    public List<Message> getMessage() {

	return messageList;

    }

    public Message updateMessage(Message message, int id) {

	if (messageList.get(id) == null) {
	    return null;
	}

	messageList.add(id, message);

	return message;

    }

    public boolean deleteMessage(int id) {
	if (messageList.get(id) == null) {
	    return false;
	}
	messageList.remove(id);
	return true;
    }

    public Message addMessage(int id, Message message) {

	messageList.add(message);
	return message;

    }
}
