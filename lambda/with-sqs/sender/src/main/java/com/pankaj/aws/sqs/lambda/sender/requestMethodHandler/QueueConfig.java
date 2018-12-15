package com.pankaj.aws.sqs.lambda.sender.requestMethodHandler;

/**
 * Created by pankaj on 12/13/2018.
 */
public class QueueConfig {
    private String topicName = "arn:aws:sns:us-east-1:292661884468:sales-order";
    public String getQueueName() {
        return topicName;
    }
}
