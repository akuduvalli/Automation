
public class MessageUtil {
	String message;
	MessageUtil(String input)
	{
		this.message = input;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String printMessage() {
		System.out.println(message);
		return this.message;
	}

}
