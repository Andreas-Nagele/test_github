package socialNetwork;

public class Photogalerycast extends News{
	
	private String photogaleryFileName;
	private String photogaleryHeadline;
	
	public Photogalerycast(String author, String photogaleryFileName, String photogaleryHeadline) {
		super();
		this.setAuthor(author);
		this.photogaleryFileName = photogaleryFileName;
		this.photogaleryHeadline = photogaleryHeadline;
	}

	public String getPhotogaleryFileName() {
		return photogaleryFileName;
	}

	public void setPhotogaleryFileName(String photogaleryFileName) {
		this.photogaleryFileName = photogaleryFileName;
	}

	public String getPhotogaleryHeadline() {
		return photogaleryHeadline;
	}

	public void setPhotogaleryHeadline(String photogaleryHeadline) {
		this.photogaleryHeadline = photogaleryHeadline;
	}
	
	public String toString() {
		return super.toString() + 
			  "\t Filename: " + this.photogaleryFileName + "\n" + 
			  "\t Headline: " + this.photogaleryHeadline + "\n";
	}
	
	/**
	 * Mehod adds likes to a post.
	 */
	@Override
	public void addLikes() {
		this.setLikes(getLikes()+1);
	}
}
