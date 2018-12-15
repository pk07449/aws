package com.pankaj.aws.sqs.lambda.sender.requestMethodHandler;

import com.amazonaws.AmazonClientException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.sqs.AmazonSQSClient;
import com.amazonaws.services.sqs.model.SendMessageRequest;

/**
 * Created by pankaj on 12/13/2018.
 */
public class MessageSender {
    QueueConfig config = new QueueConfig();

    AmazonSQSClient sqsClient = new AmazonSQSClient(new AWSCredentialsProvider() {
        public AWSCredentials getCredentials()
        {
            return new BasicAWSCredentials("AKIAJ75MUYWWDBF3VJPQ", "Ksz232uGmZQkENOAJ6ESjrXdhECm///PyAuyw+h7");
        }
        public void refresh() {

        }
    });

    public static void main(String[] args) {
        new MessageSender().send(new Message());
    }


    public void send(Message message) throws AmazonClientException {
        sqsClient.setRegion(Region.getRegion(Regions.US_EAST_1));

        SendMessageRequest send_msg_request = new SendMessageRequest()
                .withQueueUrl(config.getQueueName())
                .withMessageBody(message.getTxtMessage())
                .withDelaySeconds(5);
        sqsClient.sendMessage(send_msg_request);
    }
}