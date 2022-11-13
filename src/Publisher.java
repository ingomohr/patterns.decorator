
/**
 * This is the interface to be implemented for both the decorated object and all
 * decorators.
 */
public interface Publisher {

	String publish(String info);

	String getId();

	long getTimeSpentToSend();

}
