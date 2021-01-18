package com.kashuba.petproject.controller.command.impl;

import com.kashuba.petproject.controller.Router;
import com.kashuba.petproject.controller.command.ActionCommand;
import com.kashuba.petproject.controller.command.PageName;

import javax.servlet.http.HttpServletRequest;

public class HomePageCommand implements ActionCommand {

    @Override
    public Router execute(HttpServletRequest request) {

        return new Router(PageName.HOME.getPath());
    }
}
