package com.unimelb.swen30006.workshops;

public class Subject {
private String name;
private String subjectCode;
private Assignment a;
public void createAssignment(){
	Assignment a = new Assignment();
	this.setAssignment(a);
}
public void deleteAssignment(String name){
	this.setAssignment(null);
}
public Assignment getAssignment() {
	return a;
}
public void setAssignment(Assignment a) {
	this.a = a;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}
