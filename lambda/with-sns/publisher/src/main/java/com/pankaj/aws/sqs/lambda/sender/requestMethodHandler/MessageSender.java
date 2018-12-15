package com.pankaj.aws.sqs.lambda.sender.requestMethodHandler;

import com.amazonaws.AmazonClientException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.model.PublishRequest;

/**
 * Created by pankaj on 12/13/2018.
 */
public class MessageSender {
    MessageConfig config = new MessageConfig();

    AmazonSNSClient snsClient = new AmazonSNSClient(new AWSCredentialsProvider() {
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
        snsClient.setRegion(Region.getRegion(Regions.US_EAST_1));

        PublishRequest pr = new PublishRequest(config.getTopicName(), message.getTxtMessage())
                .withSubject(message.getSubject());
            System.out.println(snsClient.publish(pr).getMessageId());
    }
}