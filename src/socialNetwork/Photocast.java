package socialNetwork;

public class Photocast extends News{

	private String photoFileName;
	private String photoHeadline;
	
	public Photocast(String author, String photoFileName, String photoHeadline) {
		super();
		this.setAuthor(author);
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
	
	/**
	 * Method adds likes to a photo.
	 */
	@Override
	public void addLikes() {
		this.setLikes(getLikes()+1);
	}
}
