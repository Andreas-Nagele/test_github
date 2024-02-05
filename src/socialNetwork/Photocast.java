package socialNetwork;

import java.time.LocalDate;
import java.util.ArrayList;

public class Photocast extends News{

	private String photoFileName;
	private String photoHeadline;
	
	public Photocast(String author, String photoFileName, String photoHeadline) {
		this.setAuthor(author);
		this.setTimestamp(LocalDate.now());
		this.setLikes(0);
		this.setComments(new ArrayList <String>());
		this.photoFileName = photoFileName;
		this.photoHeadline = photoHeadline;
	}

	public String getPhotoFileName() {
		return photoFileName;
	}

	public void setPhotoFileName(String photoFileName) {
		this.photoFileName = photoFileName;
	}

	public String getPhotoHeadline() {
		return photoHeadline;
	}

	public void setPhotoHeadline(String photoHeadline) {
		this.photoHeadline = photoHeadline;
	}
	
	public String toString() {
		return super.toString() + 
			  "\t Filename: " + this.photoFileName + "\n" + 
			  "\t Headline: " + this.photoHeadline + "\n";
	}
	@Override
	public void addLikes() {
		this.setLikes(getLikes()+1);
	}
}
