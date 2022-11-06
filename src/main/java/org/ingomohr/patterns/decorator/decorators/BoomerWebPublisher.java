package org.ingomohr.patterns.decorator.decorators;

import org.ingomohr.patterns.decorator.InformationPublisher;
import org.ingomohr.patterns.decorator.InformationPublisherDecorator;

public class BoomerWebPublisher extends InformationPublisherDecorator {

    public BoomerWebPublisher(InformationPublisher publisher) {
        super(publisher);
    }

    @Override
    public String getId() {
        return "Facebook";
    }

    @Override
    public long getTimeSpentToSend() {
        return getDecoratedPublisher().getTimeSpentToSend() + 150;
    }

    @Override
    public String publish(String info) {
        StringBuilder builder = new StringBuilder();
        builder.append(getDecoratedPublisher().publish(info));

        builder.append("\n     - boomer boomer boomer: " + info);
        builder.append("\n" + toPublishMessage());

        return builder.toString();
    }

}
