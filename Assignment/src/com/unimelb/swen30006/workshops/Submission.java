package com.unimelb.swen30006.workshops;

// Sample private submission class to be replaced by your implementation
class Submission {
    // Return two fake files
	private int attemptNum;
	private int numFiles;
	private File[] files;
	public Submission(){
	this.attemptNum=0;
	this.numFiles=0;
	this.setFiles(new File[0]);
	}
    public File[] includedFiles(){
        File[] files = new File[2];
        files[0] = new File();
        files[1] = new File();
        numFiles+=2;
        return files;
    }
	public File[] getFiles() {
		return files;
	}
	public void setFiles(File[] files) {
		this.files = files;
	}
}
