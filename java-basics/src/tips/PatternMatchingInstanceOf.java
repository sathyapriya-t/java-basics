package tips;

class Message {

}

class TextMessage extends Message {
	private String text;

	public TextMessage(String text) {
		super();
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}

class VedioMessage extends Message {
	private String vedioType;

	public VedioMessage(String vedioType) {
		super();
		this.vedioType = vedioType;
	}

	public String getVedioType() {
		return vedioType;
	}

	public void setVedioType(String vedioType) {
		this.vedioType = vedioType;
	}

}

public class PatternMatchingInstanceOf {

	public static void main(String[] args) {
		TextMessage text = new TextMessage("txt");
		typeOfMessage(text);
	}

	private static void typeOfMessage(Message text) {

		// Regular Instance Of
		if (text instanceof TextMessage) {

			// This redundant casting is fixed in New InstanceOfPatternMatching
			// this is unneccessary because we already check the instance of the object and
			// don't need to specificaly type cast again
			// This may cause error
			TextMessage message = (TextMessage) text;
			System.out.println(message.getText());
		}

		// This is new InstanceOfPatternMatching
		// first it will check if the text is of the same type of TextMessage and then
		// it will assign to variable
		if (text instanceof TextMessage message) {
			System.out.println(message.getText());
		}
	}

}
