package org.ingomohr.patterns.decorator.decorators;

import org.ingomohr.patterns.decorator.InformationPublisher;
import org.ingomohr.patterns.decorator.InformationPublisherDecorator;

public class InstaPublisher extends InformationPublisherDecorator {

    public InstaPublisher(InformationPublisher publisher) {
        super(publisher);
    }

    @Override
    public String getId() {
        return "Insta";
    }

    @Override
    public long getTimeSpentToSend() {
        return getDecoratedPublisher().getTimeSpentToSend() + 100;
    }

    @Override
    public String publish(String info) {
        StringBuilder builder = new StringBuilder();
        builder.append(getDecoratedPublisher().publish(info));

        builder.append("\n     - insta insta insta");
        builder.append("\n" + toPublishMessage());

        return builder.toString();
    }

}
