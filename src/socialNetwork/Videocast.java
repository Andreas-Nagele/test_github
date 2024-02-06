package socialNetwork;

public class Videocast extends News{
	
	private String videoFileName;
	private String videoHeadline;
	
	public Videocast(String author, String videoFileName, String videoHeadline) {
		super();
		this.setAuthor(author);
		this.videoFileName = videoFileName;
		this.videoHeadline = videoHeadline;
	}

	public String getVideoFileName() {
		return videoFileName;
	}

	public void setVideoFileName(String videoFileName) {
		this.videoFileName = videoFileName;
	}

	public String getVideoHeadline() {
		return videoHeadline;
	}

	public void setVideoHeadline(String videoHeadline) {
		this.videoHeadline = videoHeadline;
	}
	
	

}
