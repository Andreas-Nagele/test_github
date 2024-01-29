package socialNetwork;

import java.time.LocalDate;

public class Newscast extends News {
	
	private String textMessage;

	public Newscast(String author, String textMessage) {
		this.setAuthor(author);
		this.setTimestamp(LocalDate.now());
		this.setLikes(0);
		this.setComments(null);
		this.textMessage = textMessage;
	}

	public String getTextMessage() {
		return textMessage;
	}

	public void setTextMessage(String textMessage) {
		this.textMessage = textMessage;
	}
}
