package com.unimelb.swen30006.workshops;

import java.util.Scanner;

public class Instructor extends Staff{
	private Assignment newassign;
   public void createAssignment(Subject s){
	   s.createAssignment();
	   this.newassign = s.getAssignment();
	   Scanner scan = new Scanner(System.in);
	   System.out.println("Please insert the name of assignment:");
	   newassign.setName(scan.nextLine());
	   System.out.println("Please insert the description of assignment:");
	   newassign.setDescription(scan.nextLine());
	   System.out.println("Assignment Info:");
	   System.out.println("Name: "+newassign.getName());
	   System.out.println("Description: "+newassign.getDescription());
	   //this.newassign = s.getAssignment();
	   newassign.setAvailability(true);
   }
   public void chooseMethod(){
       double num = Math.random();
       if(num<0.5){
           System.out.println("Assessment uploaded as a Turnitin file.");
       } else {
           System.out.println("Assessment uploaded as a docx file.");
       }
   }
   
   }

