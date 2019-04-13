package com.ymhase.rest.messenger.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Profile {
    private int id;
    private String name;
    private int age;

    Profile() {
    }

    public Profile(String name, int age) {
	super();
	this.id = 0;
	this.name = name;
	this.age = age;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public int getAge() {
	return age;
    }

    public void setAge(int age) {
	this.age = age;
    }

}
