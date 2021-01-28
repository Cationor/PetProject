package com.kashuba.petproject.controller.command.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kashuba.petproject.builder.PolicyBuilder;
import com.kashuba.petproject.controller.Router;
import com.kashuba.petproject.controller.command.ActionCommand;
import com.kashuba.petproject.controller.command.PageName;
import com.kashuba.petproject.util.ParameterKey;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class JsonPolicyCommand implements ActionCommand {

    @Override
    public Router execute(HttpServletRequest request, HttpServletResponse response ) throws IOException {

        Map<String, String> clientParameters = new HashMap<>();
        clientParameters.put(ParameterKey.REGISTERED_OBJECT, request.getParameter(ParameterKey.REGISTERED_OBJECT));
        clientParameters.put(ParameterKey.SUM_INSURED, request.getParameter(ParameterKey.SUM_INSURED));
        clientParameters.put(ParameterKey.CONTRACT_CURRENCY, request.getParameter(ParameterKey.CONTRACT_CURRENCY));
        clientParameters.put(ParameterKey.FIRST_NAME, request.getParameter(ParameterKey.FIRST_NAME));
        clientParameters.put(ParameterKey.SECOND_NAME, request.getParameter(ParameterKey.SECOND_NAME));
        clientParameters.put(ParameterKey.INSURANCE_COVERAGE_AREA, request.getParameter(ParameterKey.INSURANCE_COVERAGE_AREA));
        clientParameters.put(ParameterKey.TERM_OF_VALIDITY, request.getParameter(ParameterKey.TERM_OF_VALIDITY));
        clientParameters.put(ParameterKey.INSURANCE_TYPE, request.getParameter(ParameterKey.INSURANCE_TYPE));
        System.out.println(clientParameters.size());



        response.reset();
        response.setHeader("Content-Type", "application/json;charset=UTF-8");
        response.setStatus(200);
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(PolicyBuilder.buildPolicy(clientParameters));
        request.setAttribute("json", json);
        response.getWriter().write(json);

        return null;
    }
}
