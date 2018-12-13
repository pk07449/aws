package com.pankaj.aws.sns.lambda.publisher.requestMethodHandler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * Created by pankaj on 11/2/2018.
 */
public class RequestHandlerLambda implements RequestHandler<String,String> {

    public String handleRequest(String payload, Context context) {

        Response response = new Response();


        System.out.println("RequestHandlerLambda.pyaload start");
        System.out.println(payload);
        System.out.println("RequestHandlerLambda.pyaload end");
        System.out.println("RequestHandlerLambda context start");
        System.out.println(response);
        System.out.println("RequestHandlerLambda context end");

        return payload;
    }
}