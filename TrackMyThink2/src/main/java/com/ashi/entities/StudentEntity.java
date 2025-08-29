package com.ashi.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "student")
@Setter
@Getter
@ToString
public class StudentEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id", columnDefinition = "INT")
    private Integer studentId;

    private String name;

    @Column(unique = true)
    private String email;

    private String password;

    @Column(name = "contact_number",unique = true)
    private String contactNumber;

    @Column(name = "registration_date", updatable = false)
    private LocalDateTime registrationDate;

    private String gender;
    
    @Column(name = "ACTIVE_SW")
    private Boolean isActive = false;
    
    private String address;
    
    @Lob
    @Column(name = "profile_photo",columnDefinition = "LONGBLOB")
    private byte[] profilePhoto; 

    
    @PrePersist
    public void onCreate() {
        registrationDate = LocalDateTime.now();
    }


	public Integer getStudentId() {
		return studentId;
	}


	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getContactNumber() {
		return contactNumber;
	}


	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}


	public LocalDateTime getRegistrationDate() {
		return registrationDate;
	}


	public void setRegistrationDate(LocalDateTime registrationDate) {
		this.registrationDate = registrationDate;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public Boolean getIsActive() {
		return isActive;
	}


	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public byte[] getProfilePhoto() {
		return profilePhoto;
	}


	public void setProfilePhoto(byte[] profilePhoto) {
		this.profilePhoto = profilePhoto;
	}
    
    
    
    
}
