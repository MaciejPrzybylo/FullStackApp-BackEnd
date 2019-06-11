package com.boot.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "task")
public class Task {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int tid;
private String name;
private String status;
@ManyToOne
@JoinColumn (name = "uid")
private User user;






public Task() {}

public Task (String name, String status) {
	this.setName(name);
	this.setStatus(status);
}
public Task (int id, String name, String status) {
	super();
	this.tid = id;
	this.setName(name);
	this.setStatus(status);
	
}


public Task(int tid, String name, String status, User user) {
	super();
	this.tid = tid;
	this.name = name;
	this.status = status;
	this.user = user;
}


public void setTid(int tid) {
	this.tid = tid;
}
public int getTid() {
	return tid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}



}

