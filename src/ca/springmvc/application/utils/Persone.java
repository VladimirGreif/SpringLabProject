package ca.springmvc.application.utils;

import org.hibernate.annotations.Table;
import org.springframework.stereotype.Component;

@Component
public class Persone {
	
	private String personeNumber;
	private String personeName; 
	private String personeJob; 
	private String personeManagerNumber;
	private String personeDepartmentNumber;
	


	public String getPersoneNumber() {
		return personeNumber;
	}



	public void setPersoneNumber(String personeNumber) {
		this.personeNumber = personeNumber;
	}



	public String getPersoneName() {
		return personeName;
	}



	public void setPersoneName(String personeName) {
		this.personeName = personeName;
	}



	public String getPersoneJob() {
		return personeJob;
	}



	public void setPersoneJob(String personeJob) {
		this.personeJob = personeJob;
	}



	public String getPersoneManagerNumber() {
		return personeManagerNumber;
	}



	public void setPersoneManagerNumber(String personeManagerNumber) {
		this.personeManagerNumber = personeManagerNumber;
	}



	public String getPersoneDepartmentNumber() {
		return personeDepartmentNumber;
	}



	public void setPersoneDepartmentNumber(String personeDepartmentNumber) {
		this.personeDepartmentNumber = personeDepartmentNumber;
	}



	public void printPersoneData(){
		System.out.println(">>>>> The persone data is : \n>>>>> personeNumber = " + getPersoneNumber() +
				"\n>>>>> personeName = " + getPersoneName() + 
				"\n>>>>> personeJob = " + getPersoneJob() + 
				"\n>>>>> personeManagerNumber = " + getPersoneManagerNumber() +
				"\n>>>>> personeDepartmentNumber = " + getPersoneDepartmentNumber()+
				"\n>>>>> personeClass = " + this
				);
	}
}
