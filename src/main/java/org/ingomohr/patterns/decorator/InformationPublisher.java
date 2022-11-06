package org.ingomohr.patterns.decorator;

public interface InformationPublisher {

    String publish(String info);

    String getId();

    long getTimeSpentToSend();

}
