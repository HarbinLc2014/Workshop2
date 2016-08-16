package com.unimelb.swen30006.workshops;

import java.util.Date;

public class Assignment {
private String name;
private boolean availability;
private String Description;
private Date dueDate;
private int maxAttempts;
public Assignment(){
	this.setAvailability(false);
}
public Submission[] validSubmissions(){
	Submission s = new Submission();
	Submission[] s1 = null;
	return s1;
}
public boolean isAvailability() {
	return availability;
}
public void setAvailability(boolean availability) {
	this.availability = availability;
}
public void setName(String nextLine) {
	// TODO Auto-generated method stub
	this.name=nextLine;
}
public String getDescription() {
	return Description;
}
public void setDescription(String description) {
	Description = description;
}
public String getName() {
	// TODO Auto-generated method stub
	return name;
}
}
