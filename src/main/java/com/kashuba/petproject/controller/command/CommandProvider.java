package com.kashuba.petproject.controller.command;

public class CommandProvider {

    private CommandProvider() {
    }

    public static ActionCommand defineCommand(String commandName) {

        return CommandType.valueOf(commandName.toUpperCase()).getCommand();
    }
}
