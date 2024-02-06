package socialNetwork;


public class Test {

	public static void main(String[] args) {
		NewsFeed nf = new NewsFeed();
		
		News n = new Newscast("Andreas", "Das ist ein Text");
		News p = new Photocast("Andreas", "image1.png", "Klassenfoto");
		
		nf.add(n);
		nf.add(p);
		
		n.addLikes();
		p.addLikes();
		p.addLikes();
		
		String comment = "Abc";
		p.addCommentary(comment);
		p.addCommentary(comment);
		n.addCommentary(comment);
		
		nf.search("Andreas");
		
		nf.searchNews("Andreas");
		nf.searchPhotos("Andreas");
		nf.print();
		
		//n.setTimestamp();
	
		n.uploadDate(n);
	}

}
