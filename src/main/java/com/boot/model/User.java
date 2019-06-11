package com.boot.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "user")
public class User {
@Id
@GeneratedValue
private int uid;
private String username;
private String pass;





public User() {}


public User(int uid, String username, String pass) {
	this.uid = uid;
	this.username = username;
	this.pass = pass;
}


public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}




}
