package com.cognizant;

public class Widget {

    private final Twitter twitterApi;

    public Widget(Twitter twitterApi) {
        this.twitterApi = twitterApi;
    }

    long sayHelloTo(final String name) {
        try {
            return twitterApi.tweet("Hello " + name + "!");
        } catch (final Exception ex) {
            throw new RuntimeException("Twitter is down", ex);
        }
    }


}
