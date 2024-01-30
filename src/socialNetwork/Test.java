package socialNetwork;

public class Test {

	public static void main(String[] args) {
		NewsFeed nf = new NewsFeed();
		News n = new Newscast("Andreas", "Das ist ein Text");
		News p = new Photocast("Andreas", "image1.png", "Klassenfoto");
		
		nf.add(n);
		nf.add(p);
		
		System.out.println(n);
		System.out.println(p);
		
		nf.search("Andreas");
		

	}

}
