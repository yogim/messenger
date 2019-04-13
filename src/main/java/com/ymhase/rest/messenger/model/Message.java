package com.ymhase.rest.messenger.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {

    private long id;
    private String message;
    private String createdAt;
    private String author;

    public Message() {
    };

    public Message(long id, String message, String createdAt, String author) {
	super();
	this.id = id;
	this.message = message;
	this.createdAt = createdAt;
	this.author = author;
    }

    public long getId() {
	return id;
    }

    public void setId(long id) {
	this.id = id;
    }

    public String getMessage() {
	return message;
    }

    public void setMessage(String message) {
	this.message = message;
    }

    public String getCreatedAt() {
	return createdAt;
    }

    public void setCreatedAt(String createdAt) {
	this.createdAt = createdAt;
    }

    public String getAuthor() {
	return author;
    }

    public void setAuthor(String author) {
	this.author = author;
    }

}
