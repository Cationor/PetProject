package com.kashuba.petproject.controller.command.impl;

import com.kashuba.petproject.builder.JsonBuilder;
import com.kashuba.petproject.builder.PdfBuilder;
import com.kashuba.petproject.builder.PolicyBuilder;
import com.kashuba.petproject.controller.Router;
import com.kashuba.petproject.controller.command.ActionCommand;
import com.kashuba.petproject.controller.command.PageName;
import com.kashuba.petproject.model.entity.Policy;
import com.kashuba.petproject.util.ParameterKey;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class RegisterPolicyCommand implements ActionCommand {

    @Override
    public Router execute(HttpServletRequest request) {
        Map<String, String> clientParameters = new HashMap<>();
        clientParameters.put(ParameterKey.REGISTERED_OBJECT, request.getParameter(ParameterKey.REGISTERED_OBJECT));
        clientParameters.put(ParameterKey.SUM_INSURED, request.getParameter(ParameterKey.SUM_INSURED));
        clientParameters.put(ParameterKey.CONTRACT_CURRENCY, request.getParameter(ParameterKey.CONTRACT_CURRENCY));
        clientParameters.put(ParameterKey.FIRST_NAME, request.getParameter(ParameterKey.FIRST_NAME));
        clientParameters.put(ParameterKey.SECOND_NAME, request.getParameter(ParameterKey.SECOND_NAME));
        clientParameters.put(ParameterKey.INSURANCE_COVERAGE_AREA, request.getParameter(ParameterKey.INSURANCE_COVERAGE_AREA));
        clientParameters.put(ParameterKey.TERM_OF_VALIDITY, request.getParameter(ParameterKey.TERM_OF_VALIDITY));
        clientParameters.put(ParameterKey.INSURANCE_TYPE, request.getParameter(ParameterKey.INSURANCE_TYPE));

        Policy policy = PolicyBuilder.buildPolicy(clientParameters);
        request.setAttribute("policyList", policy);

        PdfBuilder.createPdf(policy);
        String json = JsonBuilder.createJson(policy);
        request.setAttribute("gsonKey", json);

        return new Router(PageName.LOGIN.getPath());
    }
}
