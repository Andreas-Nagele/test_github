package socialNetwork;

import java.time.LocalDate;
import java.util.Scanner;

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
	
	public String toString() {
		return super.toString() + 
			"\t Message: " + this.textMessage + "\n";
	}
	
	@Override
	public void addLikes() {
		this.setLikes(getLikes()+1);
	}
	
	public void addCommentary() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte einen Kommentar eingeben: ");
		String comment = sc.next();
		this.addCommentToList(comment);
		sc.close();
	}
}
