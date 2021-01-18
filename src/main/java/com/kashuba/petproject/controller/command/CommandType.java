package com.kashuba.petproject.controller.command;

import com.kashuba.petproject.controller.command.impl.RegisterPolicyCommand;
import com.kashuba.petproject.controller.command.impl.HomePageCommand;
import com.kashuba.petproject.controller.command.impl.RegisterPageCommand;

public enum CommandType {
    MOVE_REGISTER_PAGE(new RegisterPageCommand()),
    MOVE_HOME_PAGE(new HomePageCommand()),
    REGISTER_POLICY(new RegisterPolicyCommand());

    private ActionCommand command;

    CommandType(ActionCommand command) {
        this.command = command;
    }

    public ActionCommand getCommand() {
        return command;
    }
}
