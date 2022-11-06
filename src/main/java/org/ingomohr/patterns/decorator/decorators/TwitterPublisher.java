package org.ingomohr.patterns.decorator.decorators;

import org.ingomohr.patterns.decorator.InformationPublisher;
import org.ingomohr.patterns.decorator.InformationPublisherDecorator;

public class TwitterPublisher extends InformationPublisherDecorator {

    public TwitterPublisher(InformationPublisher publisher) {
        super(publisher);
    }

    @Override
    public String getId() {
        return "Twitter";
    }

    @Override
    public long getTimeSpentToSend() {
        return getDecoratedPublisher().getTimeSpentToSend() + 50;
    }

    @Override
    public String publish(String info) {
        StringBuilder builder = new StringBuilder();
        builder.append(getDecoratedPublisher().publish(info));

        builder.append("\n     - tweet tweet tweet");
        builder.append("\n" + toPublishMessage());

        return builder.toString();
    }

}
