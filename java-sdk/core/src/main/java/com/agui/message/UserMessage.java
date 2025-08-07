package com.agui.message;

public class UserMessage extends BaseMessage {

    @Override
    public String getRole() {
        return "user";
    }
}
