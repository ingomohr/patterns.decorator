package example.decorators;

import example.InformationPublisher;
import example.InformationPublisherDecorator;


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
