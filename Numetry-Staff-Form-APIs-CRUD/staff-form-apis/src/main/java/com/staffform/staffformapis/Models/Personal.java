package com.staffform.staffformapis.Models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Personal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String middleName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String mobileNo;

    @Column(nullable = false)
    private String emergencyContactNo;

    @Column(nullable = false)
    private String gender;

    @Temporal(TemporalType.DATE)
    private Date dob;

    @Column(nullable = false)
    private String emailId;

    @Column(nullable = false)
    private String permanentAddress;

    @Column(nullable = false)
    private String correspondingAddress;

    @Column(nullable = false)
    private String religion;

    // Constructors

    public Personal() {
    }

    public Personal(Long id, String firstName, String middleName,
                    String lastName, String mobileNo,
                    String emergencyContactNo, String gender, Date dob,
                    String emailId, String permanentAddress,
                    String correspondingAddress, String religion) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.mobileNo = mobileNo;
        this.emergencyContactNo = emergencyContactNo;
        this.gender = gender;
        this.dob = dob;
        this.emailId = emailId;
        this.permanentAddress = permanentAddress;
        this.correspondingAddress = correspondingAddress;
        this.religion = religion;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmergencyContactNo() {
        return emergencyContactNo;
    }

    public void setEmergencyContactNo(String emergencyContactNo) {
        this.emergencyContactNo = emergencyContactNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getCorrespondingAddress() {
        return correspondingAddress;
    }

    public void setCorrespondingAddress(String correspondingAddress) {
        this.correspondingAddress = correspondingAddress;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    // toString

    @Override
    public String toString() {
        return "Personal{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", emergencyContactNo='" + emergencyContactNo + '\'' +
                ", gender='" + gender + '\'' +
                ", dob=" + dob +
                ", emailId='" + emailId + '\'' +
                ", permanentAddress='" + permanentAddress + '\'' +
                ", correspondingAddress='" + correspondingAddress + '\'' +
                ", religion='" + religion + '\'' +
                '}';
    }
}
