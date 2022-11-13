package example.decorators;

import example.InformationPublisher;
import example.InformationPublisherDecorator;

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

        builder.append("\n     - insta insta insta: " + info);
        builder.append("\n" + toPublishMessage());

        return builder.toString();
    }

}
