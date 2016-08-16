package com.unimelb.swen30006.workshops;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SimpleTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email = "";
	ArrayList<String> email1 = new ArrayList<String>();
    Student stu = new Student();
    Instructor i = new Instructor();
    System.out.println("Instructor Account:");
    System.out.println("1.Log in   2.Exit");
    Scanner sc = new Scanner(System.in);
    int op = sc.nextInt();
    if(op==1){
    i.login();
    }
    if(i.getState()=="on"){
    	
    Subject s = new Subject();
    i.createAssignment(s);
    i.chooseMethod();
    s.getAssignment();
    System.out.println("Student Account:");
    System.out.println("1.Log in   2.Exit");    
    op = sc.nextInt();
    if(op==1){
    stu.login();
    }
    if(stu.getState()=="on"){
    stu.createSubmission();
    stu.attach();
    if(stu.getVe()!=null){
    	System.out.println("Generating mail message....");
    	ValidationError[] ve = stu.getVe();
    	ValidationError v = ve[0];
    	 ArrayList<Error> e = v.errors;
    		Iterator it = e.iterator();
    		while (it.hasNext()){
    			Error er = (Error)it.next();
    			String s1 = er.key;
    			String s2 = er.value;
    	System.out.println(s1+" : "+s2);
    	email1.add(s1+" : "+s2);
    	email=email+s1+": "+s2;
    	System.out.println("Generation complete, starting sending an mail...");
 
    		}
    	   	stu.setEmail(email1);
        	//System.out.println(email);
            stu.sendEmailMsg(email1);
        	float grade = stu.totalGrade();
        	System.out.println("Final Grade: "+grade);
    }
	}
	}
	}
}
