package com.kashuba.petproject.controller.command;

public enum PageName {
    REGISTER("/jsp/register.jsp"),
    LOGIN("/jsp/policy.jsp"),
    HOME("/jsp/home.jsp");

    private String path;

    PageName(String path) { this.path = path; }

    public String getPath() {
        return path;
    }
}
