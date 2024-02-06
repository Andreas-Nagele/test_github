package socialNetwork;

public class Commentary {
	
	private String text;
	private int likes;
	
	public Commentary(String text) {
		this.text = text;
		this.likes = 0;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}
	
	public String toString() {
		return "Kommentar: \n" + 
				"\t Text: " + this.text + "\n" +
				"\t Anzahl Likes: " + this.likes + "\n";
	}
	
	public void addLike() {
		this.setLikes(getLikes() + 1);
	}
}
