package example;

public class Main {

    public static void main(String[] args) {
        InformationPublisher publisher = new BoomerWebPublisher(
                new InstaPublisher(new TwitterPublisher(new NullPublisher())));

        publisher.publish("Hello World!");
    }

}
