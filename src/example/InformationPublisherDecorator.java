package example;

import java.util.Objects;

public abstract class InformationPublisherDecorator implements InformationPublisher {

    private InformationPublisher decoratedPublisher;

    public InformationPublisherDecorator(InformationPublisher publisher) {
        decoratedPublisher = Objects.requireNonNull(publisher);
    }

    @Override
    public String publish(String info) {
        return decoratedPublisher.publish(info);
    }

    @Override
    public long getTimeSpentToSend() {
        return decoratedPublisher.getTimeSpentToSend();
    }

    protected String toPublishMessage() {
        return "Published to " + getId() + " (" + getTimeSpentToSend() + "ms total)";
    }

    protected InformationPublisher getDecoratedPublisher() {
        return decoratedPublisher;
    }

}
