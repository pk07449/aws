package com.pankaj.aws.java.lambda.requestMethodHandler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * Created by pankaj on 11/2/2018.
 */
public class RequestHandlerLambda implements RequestHandler<Request,Response> {

    public Response handleRequest(Request request, Context context) {

        Response response = new Response();
        response.setId(100 + request.getId());
        response.setName("Hello "+request.getName());

        return response;
    }
}