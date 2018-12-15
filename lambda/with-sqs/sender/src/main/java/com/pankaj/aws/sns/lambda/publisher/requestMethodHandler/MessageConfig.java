package com.pankaj.aws.sns.lambda.publisher.requestMethodHandler;

/**
 * Created by pankaj on 12/13/2018.
 */
public class MessageConfig {
    private String topicName = "arn:aws:sns:us-east-1:292661884468:sales-order";
    public String getTopicName() {
        return topicName;
    }
}
