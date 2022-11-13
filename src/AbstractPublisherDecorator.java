import java.util.Objects;

/**
 * Base class for all decorators.
 */
public abstract class AbstractPublisherDecorator implements Publisher {

	private Publisher decoratedPublisher;

	public AbstractPublisherDecorator(Publisher publisher) {
		decoratedPublisher = Objects.requireNonNull(publisher);
	}

	@Override
	public String publish(String info) {
		return decoratedPublisher.publish(info);
	}

	@Override
	public long getTimeSpentToSend() {
		return decoratedPublisher.getTimeSpentToSend();
	}

	protected String toPublishMessage() {
		return "Published to " + getId() + " (" + getTimeSpentToSend() + "ms total)";
	}

	protected Publisher getDecoratedPublisher() {
		return decoratedPublisher;
	}

}
