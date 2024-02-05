package socialNetwork;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public abstract class News {
	
	private String author;
	private LocalDate timestamp;
	private int likes;
	private ArrayList <String> comments;
	
	public News() {
		this.timestamp = LocalDate.now();
		this.likes = 0;
		this.comments = new ArrayList<>();
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public LocalDate getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDate timestamp) {
		this.timestamp = timestamp;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public ArrayList<String> getComments() {
		return comments;
	}
	public void setComments(ArrayList<String> comments) {
		this.comments = comments;
	}
	
	public String toString() {
		return "Beitrag: \n" + 
				"\t Benutzername des Autors: " + this.author + "\n" +
				"\t Zeitstempel: " + this.timestamp + "\n" +
				"\t Anzahl Likes: " + this.likes + "\n" +
				"\t Kommentare: " + this.comments + "\n";
	}
	

	public abstract void addLikes();
	//public abstract LocalDate uploadTime();
	public void addCommentary(String comment) {
		this.comments.add(comment);
	}
	
	public void uploadDate() {
		LocalDate start = LocalDate.now();
		LocalDate end = LocalDate.now();
		
		long time = ChronoUnit.HOURS.between(start, end);
		System.out.println(time);
	}
}