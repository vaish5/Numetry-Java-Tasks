package com.staffform.staffformapis.Models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Other {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String aadhaarNo;

    @Column(nullable = false)
    private String panNo;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date doj;

    @Column(nullable = false)
    private String staffReferenceCode;

    @Column(nullable = false)
    private String salaryPayType;

    @Column(nullable = false)
    private String governmentId;

    private String citizenship;

    // Constructors

    public Other() {
    }

    public Other(Long id, String aadhaarNo, String panNo, Date doj,
                 String staffReferenceCode, String salaryPayType,
                 String governmentId, String citizenship) {
        this.id = id;
        this.aadhaarNo = aadhaarNo;
        this.panNo = panNo;
        this.doj = doj;
        this.staffReferenceCode = staffReferenceCode;
        this.salaryPayType = salaryPayType;
        this.governmentId = governmentId;
        this.citizenship = citizenship;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAadhaarNo() {
        return aadhaarNo;
    }

    public void setAadhaarNo(String aadhaarNo) {
        this.aadhaarNo = aadhaarNo;
    }

    public String getPanNo() {
        return panNo;
    }

    public void setPanNo(String panNo) {
        this.panNo = panNo;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    public String getStaffReferenceCode() {
        return staffReferenceCode;
    }

    public void setStaffReferenceCode(String staffReferenceCode) {
        this.staffReferenceCode = staffReferenceCode;
    }

    public String getSalaryPayType() {
        return salaryPayType;
    }

    public void setSalaryPayType(String salaryPayType) {
        this.salaryPayType = salaryPayType;
    }

    public String getGovernmentId() {
        return governmentId;
    }

    public void setGovernmentId(String governmentId) {
        this.governmentId = governmentId;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    // toString

    @Override
    public String toString() {
        return "Other{" +
                "id=" + id +
                ", aadhaarNo='" + aadhaarNo + '\'' +
                ", panNo='" + panNo + '\'' +
                ", doj=" + doj +
                ", staffReferenceCode='" + staffReferenceCode + '\'' +
                ", salaryPayType='" + salaryPayType + '\'' +
                ", governmentId='" + governmentId + '\'' +
                ", citizenship='" + citizenship + '\'' +
                '}';
    }
}
