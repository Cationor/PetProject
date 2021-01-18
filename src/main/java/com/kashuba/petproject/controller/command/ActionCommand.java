package com.kashuba.petproject.controller.command;

import com.kashuba.petproject.controller.Router;

import javax.servlet.http.HttpServletRequest;


public interface ActionCommand {

    Router execute(HttpServletRequest request);
}
