package com.stackroute.qualificationconsumer.QualificationMicroservice.model;

import java.util.Date;

public class Qualification {
	
private String academicQual_userId;
private String academicQualification;
public String getAcademicQual_userId() {
	return academicQual_userId;
}
public void setAcademicQual_userId(String academicQual_userId) {
	this.academicQual_userId = academicQual_userId;
}
public String getAcademicQualification() {
	return academicQualification;
}
public void setAcademicQualification(String academicQualification) {
	this.academicQualification = academicQualification;
}
@Override
public String toString() {
	return "Qualification [academicQual_userId=" + academicQual_userId + ", academicQualification="
			+ academicQualification + "]";
}
public Qualification() {
	super();
	// TODO Auto-generated constructor stub
}


}
