package org.ingomohr.patterns.decorator;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.ingomohr.patterns.decorator.decorators.BoomerWebPublisher;
import org.ingomohr.patterns.decorator.decorators.InstaPublisher;
import org.ingomohr.patterns.decorator.decorators.TwitterPublisher;

/**
 * InformationPublisherAppResource
 */
@Path("/hello")
public class InformationPublisherAppResource {

    public static void main(String[] args) {
        InformationPublisher publisher = new BoomerWebPublisher(
                new InstaPublisher(new TwitterPublisher(new NullPublisher())));

        publisher.publish("Hello World!");
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        InformationPublisher publisher = new BoomerWebPublisher(
                new InstaPublisher(new TwitterPublisher(new NullPublisher())));

        return publisher.publish("Hello World!");
    }

}
