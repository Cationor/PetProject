package com.kashuba.petproject.model.entity;

import java.time.LocalDate;
import java.util.Objects;

public class Policy {

    private String registeredObject;
    private int sumInsured;
    private String contractCurrency;
    private String firstName;
    private String secondName;
    private String insuranceCoverageArea;
    private LocalDate termOfValidity;
    private String insuranceType;

    public String getRegisteredObject() {
        return registeredObject;
    }

    public void setRegisteredObject(String registeredObject) {
        this.registeredObject = registeredObject;
    }

    public int getSumInsured() {
        return sumInsured;
    }

    public void setSumInsured(int sumInsured) {
        this.sumInsured = sumInsured;
    }

    public String getContractCurrency() {
        return contractCurrency;
    }

    public void setContractCurrency(String contractCurrency) {
        this.contractCurrency = contractCurrency;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getInsuranceCoverageArea() {
        return insuranceCoverageArea;
    }

    public void setInsuranceCoverageArea(String insuranceCoverageArea) {
        this.insuranceCoverageArea = insuranceCoverageArea;
    }

    public LocalDate getTermOfValidity() {
        return termOfValidity;
    }

    public void setTermOfValidity(LocalDate termOfValidity) {
        this.termOfValidity = termOfValidity;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }


    @Override
    public String toString() {
        return "Policy{" +
                "registeredObject='" + registeredObject + '\'' +
                ", sumInsured=" + sumInsured +
                ", contractCurrency='" + contractCurrency + '\'' +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", insuranceCoverageArea='" + insuranceCoverageArea + '\'' +
                ", termOfValidity=" + termOfValidity +
                ", insuranceType='" + insuranceType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Policy policy = (Policy) o;
        return sumInsured == policy.sumInsured &&
                Objects.equals(registeredObject, policy.registeredObject) &&
                Objects.equals(contractCurrency, policy.contractCurrency) &&
                Objects.equals(firstName, policy.firstName) &&
                Objects.equals(secondName, policy.secondName) &&
                Objects.equals(insuranceCoverageArea, policy.insuranceCoverageArea) &&
                Objects.equals(termOfValidity, policy.termOfValidity) &&
                Objects.equals(insuranceType, policy.insuranceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registeredObject, sumInsured, contractCurrency, firstName, secondName, insuranceCoverageArea, termOfValidity, insuranceType);
    }
}
