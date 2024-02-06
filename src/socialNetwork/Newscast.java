package socialNetwork;

public class Newscast extends News {
	
	private String textMessage;

	public Newscast(String author, String textMessage) {
		super();
		this.setAuthor(author);
		this.textMessage = textMessage;
	}

	public String getTextMessage() {
		return textMessage;
	}

	public void setTextMessage(String textMessage) {
		this.textMessage = textMessage;
	}
	
	public String toString() {
		return super.toString() + 
			"\t Message: " + this.textMessage + "\n";
	}
	
	/**
	 * Mehod adds likes to a post.
	 */
	@Override
	public void addLikes() {
		this.setLikes(getLikes()+1);
	}

}