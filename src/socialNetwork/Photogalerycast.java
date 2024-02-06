package socialNetwork;

public class Photogalerycast extends News{
	
	private String photoFileName;
	private String photoHeadline;
	
	public Photocast(String author, String photoFileName, String photoHeadline) {
		super();
		this.setAuthor(author);
		this.photoFileName = photoFileName;
		this.photoHeadline = photoHeadline;
	}

}
