
public class PublisherForMail implements Publisher {

	@Override
	public String publish(String info) {
		return "Published as mail: " + info + " (" + getTimeSpentToSend() + "ms total)";
	}

	@Override
	public String getId() {
		return "Mail";
	}

	@Override
	public long getTimeSpentToSend() {
		return 10;
	}

}
