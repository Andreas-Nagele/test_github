package socialNetwork;

import java.time.LocalDate;
import java.util.ArrayList;

public class Photocast extends News{

	private String photoFileName;
	private String photoHeadline;
	
	public Photocast(String author, int likes, ArrayList<String> comments,
			String fotoFileName, String fotoHeadline) {
		this.setAuthor(author);
		this.setTimestamp(LocalDate.now());
		this.setLikes(likes);
		this.setComments(comments);
		this.photoFileName = photoFileName;
		this.photoHeadline = photoHeadline;
	}
}
