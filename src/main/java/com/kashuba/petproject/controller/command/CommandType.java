package com.kashuba.petproject.controller.command;

import com.kashuba.petproject.controller.command.impl.*;

public enum CommandType {
    MOVE_REGISTER_PAGE(new RegisterPageCommand()),
    MOVE_HOME_PAGE(new HomePageCommand()),
    REGISTER_POLICY(new RegisterPolicyCommand()),
    MOVE_JSONPOLICY(new JsonPolicyCommand()),
    MOVE_PDFPOLICY(new PdfPolicyCommand());

    private ActionCommand command;

    CommandType(ActionCommand command) {
        this.command = command;
    }

    public ActionCommand getCommand() {
        return command;
    }
}
