package com.sb.Api.model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class contacts {
@Id
private long mobile_number;
private String name;
private int country_code;
private String emailid;
private String country_name;

// using getter and setters to get and set values to variables.
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getCountry_code() {
	return country_code;
}
public void setCountry_code(int country_code) {
	this.country_code = country_code;
}
public long getMobile_number() {
	return mobile_number;
}
public void setMobile_number(long mobile_number) {
	this.mobile_number = mobile_number;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getCountry_name() {
	return country_name;
}
public void setCountry_name(String country_name) {
	this.country_name = country_name;
}

}
