package com.kodilla.patterns.strategy.social;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies() {
        FacebookPublisher facebookPublisher = new FacebookPublisher();
        SnapchatPublisher snapchatPublisher = new SnapchatPublisher();
        TwitterPublisher twitterPublisher = new TwitterPublisher();

        assertEquals("X",twitterPublisher.share());
        assertEquals("FACEBOOK",facebookPublisher.share());
        assertEquals("SNAPCHAT",snapchatPublisher.share());
    }

    @Test
    void testIndividualSharingStrategy() {

        FacebookPublisher facebookPublisher = new FacebookPublisher();
        SnapchatPublisher snapchatPublisher = new SnapchatPublisher();
        User adam = new User("Adam");
        adam.setSocialPublisher(snapchatPublisher);

        assertEquals("SNAPCHAT",snapchatPublisher.share());



    }
}
