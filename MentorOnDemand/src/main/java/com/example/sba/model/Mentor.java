
  package com.example.sba.model;
  
  import java.io.Serializable; import java.util.HashSet; import java.util.Set;
  
  import javax.persistence.CascadeType; import javax.persistence.Column; import
  javax.persistence.Entity; import javax.persistence.FetchType; import
  javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
  import javax.persistence.Id; import javax.persistence.JoinColumn; import
  javax.persistence.JoinTable; import javax.persistence.ManyToMany; import
  javax.persistence.Table;
  
  import com.fasterxml.jackson.annotation.JsonManagedReference;
  
  
  @Entity
  
  @Table(name = "Mentor")
  public class Mentor implements Serializable {
  
  @Id
  
  @GeneratedValue(strategy = GenerationType.IDENTITY) 
  private int id;
  
  @Column(name="first_name")
  private String firstName;
  
  @Column(name="last_name")
  private String lastName;
  
  @Column(name="user_name")
  private String userName;
  
  @Column(name="linkedin_url") private String linkedinUrl;
  
  @Column(name="password") private String password;
  
  @Column(name="contact") private Long contact;
  
  @Column(name="reg_datetime") private String regDatetime ;
  
  @Column(name="reg_code") private String regCode;

  
  
  
  public int getId() { return id; }
  
  public void setId(int id) { this.id = id; }
  
  
  public String getLinkedinUrl() { return linkedinUrl; }
  
  public void setLinkedinUrl(String linkedinUrl) { this.linkedinUrl =
  linkedinUrl; }
  
  public String getPassword() { return password; }
  
  public void setPassword(String password) { this.password = password; }
  
  public Long getContact() { return contact; }
  
  public void setContact(Long contact) { this.contact = contact; }
  
  public String getRegDatetime() { return regDatetime; }
  
  public void setRegDatetime(String regDatetime) { this.regDatetime =
  regDatetime; }
  
  public String getRegCode() { return regCode; }
  
  public void setRegCode(String regCode) { this.regCode = regCode; } public
  Mentor(String username, String linkedinUrl, String password, Long contact,
  String regDatetime, String regCode) { super(); this.userName = username;
  this.linkedinUrl = linkedinUrl; this.password = password; this.contact =
  contact; this.regDatetime = regDatetime; this.regCode = regCode; } public
  Mentor() { super(); // TODO Auto-generated constructor stub }

  }

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}
  
  }
 