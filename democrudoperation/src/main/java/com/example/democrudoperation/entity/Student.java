package com.example.democrudoperation.entity;


import jakarta.persistence.Id; // ✅ CORRECT (for JPA/Hibernate)

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;


import jakarta.persistence.Table;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name="student")


public class Student {
	
	
	public Student() {
		
	}
	
public Student(String name, float precentage, String branch) {
		super();
		this.name = name;
		this.precentage = precentage;
		this.branch = branch;
	}
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
int rollno;
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", precentage=" + precentage + ", branch=" + branch + "]";
}
public Student(int rollno) {
	super();
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getPrecentage() {
	return precentage;
}
public void setPrecentage(float precentage) {
	this.precentage = precentage;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
@Column(name="student_name")
private String name;
@Column(name="student_precentage")
private float precentage;
@Column(name="student_branch")
private String branch;


}
