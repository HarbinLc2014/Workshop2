package com.unimelb.swen30006.workshops;

import java.util.ArrayList;
import java.util.Iterator;

public class Student extends Person{
private String studentID;
private ArrayList<String> email;
private Submission sub;
private ValidationError[] ve = null;
public void sendEmailMsg(ArrayList<String> msg){
	Iterator t1  = msg.iterator();
	System.out.println("An email has been sent.");
	System.out.println("Student has received an email:");
	while(t1.hasNext()){
		String aa =(String)t1.next();
		System.out.println(aa);
	}

}
public float totalGrade(){
	double grade;
	grade=Math.random()*100;
	int g;
	g=(int) (grade);
	return (float) (grade);
}
public void createSubmission(){
	Submission s = new Submission();
	s.includedFiles();
	this.sub=s;
}
public void attach(){
	SampleValidator sv = new SampleValidator();
	setVe(sv.validateSubmission(sub));
}
public ValidationError[] getVe() {
	return ve;
}
public void setVe(ValidationError[] ve) {
	this.ve = ve;
}
public ArrayList<String> getEmail() {
	return email;
}
public void setEmail(ArrayList<String> email) {
	this.email = email;
}

}
