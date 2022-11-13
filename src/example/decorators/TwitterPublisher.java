package example.decorators;

import example.InformationPublisher;
import example.InformationPublisherDecorator;

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

        builder.append("\n     - tweet tweet tweet: " + info);
        builder.append("\n" + toPublishMessage());

        return builder.toString();
    }

}
