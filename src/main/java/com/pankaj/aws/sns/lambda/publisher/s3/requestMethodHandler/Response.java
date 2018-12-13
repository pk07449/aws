package com.pankaj.aws.sns.lambda.publisher.s3.requestMethodHandler;

/**
 * Created by pankaj on 11/2/2018.
 */
public class Response {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Response{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
