package com.unimelb.swen30006.workshops;

import java.util.Date;

public class Person {
 private String name;
 private Date dob;
 private String address;
 private String state;
 public Person(){
	 setState("off");
 }
 public void login(){
	setState("on");
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
}
