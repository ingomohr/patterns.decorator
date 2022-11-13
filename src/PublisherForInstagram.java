public class PublisherForInstagram extends AbstractPublisherDecorator {

	public PublisherForInstagram(Publisher publisher) {
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

		builder.append("\n     - sending message to Instagram: " + info);
		builder.append("\n" + toPublishMessage());

		return builder.toString();
	}

}
