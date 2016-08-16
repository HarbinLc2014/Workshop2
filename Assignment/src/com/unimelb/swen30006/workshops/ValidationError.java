package com.unimelb.swen30006.workshops;

import java.util.ArrayList;

//import java.util.HashMap;

/**
 * A class that represents all validation errors for a given
 * file, storing the errors as a key value mapping
 */
public class ValidationError {

    /* A map of error type to error message */
	public ArrayList<Error> errors;
	/* The file that it originally came from */	
    public File file;

    /**
     * Create a new validation error for a given file
     * @param file the file the validation error belongs to
     */
    public ValidationError(File file){
        this.file = file;
        this.errors = new ArrayList<Error>();
//        this.errors = new HashMap<String,String>();
    }

    /**
     * Adds the error to the key mapping value
     * @param key The error key
     * @param value The detailed description of the error
     */
    public void addError(String key, String value){
    	Error e = new Error(key, value);
    	this.errors.add(e);
    }


}

final class Error {
	public final String key;
	public final String value;
	
	public Error(String key, String value){
		this.key = key;
		this.value = value;
	}
}