package com.springrest.springrest;

public class student {
	private String firstname;
	private Integer rollno;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public Integer getRollno() {
		return rollno;
	}
	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}
	public student(String firstname, Integer rollno) {
		super();
		this.firstname = firstname;
		this.rollno = rollno;
	}

}
