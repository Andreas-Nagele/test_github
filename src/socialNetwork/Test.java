package socialNetwork;


public class Test {

	public static void main(String[] args) {
		NewsFeed nf = new NewsFeed();
		
		News n = new Newscast("Andreas", "Das ist ein Text");
		News p = new Photocast("Andreas", "image1.png", "Klassenfoto");
		
		nf.add(n);
		nf.add(p);
		
		//nf.search("Andreas");
		
		//nf.print();
		n.addLikes();
		p.addLikes();
		p.addLikes();
		
		String comment = "Abc";
		p.addCommentary(comment);
		p.addCommentary(comment);
		n.addCommentary(comment);
		nf.print();
	
	}

}
