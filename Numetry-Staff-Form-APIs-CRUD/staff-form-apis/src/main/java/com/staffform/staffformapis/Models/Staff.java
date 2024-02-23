package com.staffform.staffformapis.Models;

import jakarta.persistence.*;

@Entity
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String employmentStatus;
    private String staffType;
    @Column(nullable = false)
    private String staffDepartment;
    @Column(nullable = false)
    private String employmentCategory;
    @Column(nullable = false)
    private String designation;
    @Column(nullable = false)
    private String qualificationType;
    @Column(nullable = false)
    private String educationQualification;
    @Column(nullable = false)
    private String accessLevel;
    @Column(nullable = false)
    private String trainedAs;
    private String ctetQualified;

    // Constructors

    public Staff() {
    }

    public Staff(Long id, String employmentStatus, String staffType,
                 String staffDepartment, String employmentCategory,
                 String designation, String qualificationType,
                 String educationQualification, String accessLevel,
                 String trainedAs, String ctetQualified) {
        this.id = id;
        this.employmentStatus = employmentStatus;
        this.staffType = staffType;
        this.staffDepartment = staffDepartment;
        this.employmentCategory = employmentCategory;
        this.designation = designation;
        this.qualificationType = qualificationType;
        this.educationQualification = educationQualification;
        this.accessLevel = accessLevel;
        this.trainedAs = trainedAs;
        this.ctetQualified = ctetQualified;
    }

    // Getters and Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public String getStaffType() {
        return staffType;
    }

    public void setStaffType(String staffType) {
        this.staffType = staffType;
    }

    public String getStaffDepartment() {
        return staffDepartment;
    }

    public void setStaffDepartment(String staffDepartment) {
        this.staffDepartment = staffDepartment;
    }

    public String getEmploymentCategory() {
        return employmentCategory;
    }

    public void setEmploymentCategory(String employmentCategory) {
        this.employmentCategory = employmentCategory;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getQualificationType() {
        return qualificationType;
    }

    public void setQualificationType(String qualificationType) {
        this.qualificationType = qualificationType;
    }

    public String getEducationQualification() {
        return educationQualification;
    }

    public void setEducationQualification(String educationQualification) {
        this.educationQualification = educationQualification;
    }

    public String getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
    }

    public String getTrainedAs() {
        return trainedAs;
    }

    public void setTrainedAs(String trainedAs) {
        this.trainedAs = trainedAs;
    }

    public String getCtetQualified() {
        return ctetQualified;
    }

    public void setCtetQualified(String ctetQualified) {
        this.ctetQualified = ctetQualified;
    }

    // toString

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", employmentStatus='" + employmentStatus + '\'' +
                ", staffType='" + staffType + '\'' +
                ", staffDepartment='" + staffDepartment + '\'' +
                ", employmentCategory='" + employmentCategory + '\'' +
                ", designation='" + designation + '\'' +
                ", qualificationType='" + qualificationType + '\'' +
                ", educationQualification='" + educationQualification + '\'' +
                ", accessLevel='" + accessLevel + '\'' +
                ", trainedAs='" + trainedAs + '\'' +
                ", ctetQualified='" + ctetQualified + '\'' +
                '}';
    }
}
