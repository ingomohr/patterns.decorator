package example;

public class NullPublisher implements InformationPublisher {

    @Override
    public String publish(String info) {
        return "";
    }

    @Override
    public String getId() {
        return "do-nothing";
    }

    @Override
    public long getTimeSpentToSend() {
        return 0;
    }

}
