
	package com.unimelb.swen30006.workshops;

import java.util.Date;

	// Sample private file class to be replaced by your implementaiton
	class File {
		private String fileName;
		private Date createdDate;
		private String fileData;
	    public String fileType(){
	        double num = Math.random();
	        if(num<0.5){
	            return "pdf";
	        } else {
	            return "docx";
	        }
	    }
	    public String content(){
	    	return "aaa";
	    }
	    public int fileSize(){
	    	return 1;
	    }
	    
	}