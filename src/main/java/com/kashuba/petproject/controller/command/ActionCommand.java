package com.kashuba.petproject.controller.command;

import com.kashuba.petproject.controller.Router;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public interface ActionCommand {

    Router execute(HttpServletRequest request, HttpServletResponse response) throws IOException;
}
