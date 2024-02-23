package com.schooltransportationform.schoolform.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Student {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "student_name", nullable = false)
    private String studentName;

    @Column(name = "school_name", nullable = false)
    private String schoolName;

    @Column(name = "grade", nullable = false)
    private String grade;

    @Column(name = "date_to_begin", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateToBegin;

    @Column(name = "parent_name", nullable = false)
    private String parentName;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "address2")
    private String address2;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "state", nullable = false)
    private String state;

    @Column(name = "zip_code", nullable = false)
    private String zipCode;

    @Column(name = "phone_number", nullable = false, unique = true)
    private String phoneNumber;

    @Column(name = "email_address", nullable = false, unique = true)
    private String emailAddress;

    // Constructors, Getters and Setters
    public Student() {
    }

    public Student(Long id, String studentName, String schoolName, String grade,
                   Date dateToBegin, String parentName, String address,
                   String address2, String city, String state, String zipCode,
                   String phoneNumber, String emailAddress) {
        this.id = id;
        this.studentName = studentName;
        this.schoolName = schoolName;
        this.grade = grade;
        this.dateToBegin = dateToBegin;
        this.parentName = parentName;
        this.address = address;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Date getDateToBegin() {
        return dateToBegin;
    }

    public void setDateToBegin(Date dateToBegin) {
        this.dateToBegin = dateToBegin;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
