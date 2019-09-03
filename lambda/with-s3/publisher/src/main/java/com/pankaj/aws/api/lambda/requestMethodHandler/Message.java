package com.pankaj.aws.api.lambda.requestMethodHandler;

/**
 * Created by pankaj on 12/13/2018.
 */
public class Message {
    String subject;
    private String txtMessage ="Hello";

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTxtMessage() {
        return "Hello";
    }

    public void setTxtMessage(String txtMessage) {
        this.txtMessage = txtMessage;
    }
}
