package com.pankaj.aws.sns.lambda.publisher.methodhanler;

import com.amazonaws.services.lambda.runtime.Context;

/**
 * Created by pankaj on 11/2/2018.
 */
public class MethodHandlerLambda {
    public String handleRequest(String input, Context context) {
        context.getLogger().log("Input: " + input);
        return "Hello World - " + input;
    }
}
