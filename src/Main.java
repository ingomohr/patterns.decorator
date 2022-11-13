
public class Main {

	public static void main(String[] args) {
		Publisher publisher = new PublisherForFacebook(
				new PublisherForInstagram(new PublisherForTwitter(new PublisherForMail())));

		String log = publisher.publish("Hello World!");
		System.out.println(log);
	}

}
