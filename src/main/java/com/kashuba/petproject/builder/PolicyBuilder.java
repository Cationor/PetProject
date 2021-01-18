package com.kashuba.petproject.builder;

import com.kashuba.petproject.model.entity.Policy;
import com.kashuba.petproject.util.ParameterKey;

import java.time.LocalDate;
import java.util.Map;

public class PolicyBuilder {
    private PolicyBuilder() {
    }

    public static Policy buildPolicy(Map<String, String> clientParameters) {
        Policy buildingPolicy = new Policy();

        LocalDate termOfValidity = LocalDate.parse(clientParameters.get(ParameterKey.TERM_OF_VALIDITY));
        buildingPolicy.setTermOfValidity(termOfValidity);
        buildingPolicy.setRegisteredObject(clientParameters.get(ParameterKey.REGISTERED_OBJECT));
        buildingPolicy.setSumInsured(Integer.parseInt(clientParameters.get(ParameterKey.SUM_INSURED)));
        buildingPolicy.setContractCurrency(clientParameters.get(ParameterKey.CONTRACT_CURRENCY));
        buildingPolicy.setFirstName(clientParameters.get(ParameterKey.FIRST_NAME));
        buildingPolicy.setSecondName(clientParameters.get(ParameterKey.SECOND_NAME));
        buildingPolicy.setInsuranceCoverageArea(clientParameters.get(ParameterKey.INSURANCE_COVERAGE_AREA));
        buildingPolicy.setInsuranceType(clientParameters.get(ParameterKey.INSURANCE_TYPE));

        return buildingPolicy;
    }
}
