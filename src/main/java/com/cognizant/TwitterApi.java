package com.cognizant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class TwitterApi implements Twitter{
    private final List<String> tweets = new ArrayList<>();

    @Override
    public long tweet(final String message) throws Exception {
        Thread.sleep(1000);
        tweets.add(message);
        return tweets.size();
    }

    @Override
    public List<String> getTweets() {
        return Collections.unmodifiableList(tweets);
    }




}
