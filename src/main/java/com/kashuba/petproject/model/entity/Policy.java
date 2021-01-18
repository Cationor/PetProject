package com.kashuba.petproject.model.entity;

import java.time.LocalDate;

public class Policy extends Entity {

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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Policy policy = (Policy) o;

        return registeredObject == null ? policy.registeredObject == null
                : registeredObject.equals(policy.registeredObject)
                && sumInsured == policy.sumInsured
                &&  contractCurrency == null ? policy.contractCurrency == null
                : contractCurrency.equals(policy.contractCurrency)
                &&  firstName == null ? policy.firstName == null
                : firstName.equals(policy.firstName)
                &&  secondName == null ? policy.secondName == null
                : secondName.equals(policy.secondName)
                &&  insuranceCoverageArea == null ? policy.insuranceCoverageArea == null
                : insuranceCoverageArea.equals(policy.insuranceCoverageArea)
                &&  termOfValidity == null ? policy.termOfValidity == null
                : termOfValidity.equals(policy.termOfValidity)
                &&  insuranceType == null ? policy.insuranceType == null
                : insuranceType.equals(policy.insuranceType);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result += 37 * result + (registeredObject == null ? 0 : registeredObject.hashCode());
        result += 37 * result + (contractCurrency == null ? 0 : contractCurrency.hashCode());
        result += 37 * result + (firstName == null ? 0 : firstName.hashCode());
        result += 37 * result + (secondName == null ? 0 : secondName.hashCode());
        result += 37 * result + (insuranceCoverageArea == null ? 0 : insuranceCoverageArea.hashCode());
        result += 37 * result + (insuranceType == null ? 0 : insuranceType.hashCode());
        result += 37 * result + sumInsured;
        result += 37 * result + (termOfValidity == null ? 0 : termOfValidity.hashCode());

        return result;
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
}
