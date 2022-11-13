public class PublisherForFacebook extends AbstractPublisherDecorator {

	public PublisherForFacebook(Publisher publisher) {
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

		builder.append("\n     - sending message to facebook...");
		builder.append("\n" + toPublishMessage());

		return builder.toString();
	}

}
