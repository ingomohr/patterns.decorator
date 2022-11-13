public class PublisherForTwitter extends AbstractPublisherDecorator {

	public PublisherForTwitter(Publisher publisher) {
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

		builder.append("\n     - sending message to Twitter: " + info);
		builder.append("\n" + toPublishMessage());

		return builder.toString();
	}

}
