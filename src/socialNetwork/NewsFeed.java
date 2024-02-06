package socialNetwork;

import java.util.ArrayList;

public class NewsFeed {

	private ArrayList <News> news;
	
	public NewsFeed() {
		this.news = new ArrayList<News>();
	}

	public ArrayList<News> getNews() {
		return news;
	}

	public void setNews(ArrayList<News> news) {
		this.news = news;
	}
	
	/**
	 * Method adds News to the ArrayList news.
	 * @param n is the News you want to add.
	 */
	public void add(News n) {
		if (!this.news.contains(n)) {
			this.news.add(n);
		}
	}
	
	/**
	 * Method removes a News from the ArrayList news.
	 * @param n is the News you want to delete.
	 */
	public void remove(News n) {
		this.news.remove(n);
	}
	
	/**
	 * Method prints all the news in the news ArrayList.
	 */
	public void print() {
		for (News n : this.news) {
			System.out.println(n);
		}
	}
	
	/**
	 * Method prints all the news from a specific author.
	 * @param author is the person, you want to see their posts.
	 */
	public void searchNews(String author) {
		ArrayList <News> searchnews = new ArrayList<News>();
		for (News n : this.news) {
			if (n.getAuthor().equals(author)  && n instanceof Newscast) {
				searchnews.add(n);
			}
		}
		System.out.println(searchnews);
	}
	
	/**
	 * Method prints all the photos from a specific author.
	 * @param author is the person, you want to see their posts.
	 */
	public void searchPhotos(String author) {
		ArrayList <News> searchphotos = new ArrayList<News>();
		for (News n : this.news) {
			if (n.getAuthor().equals(author) && n instanceof Photocast) {
				searchphotos.add(n);
			}
		}
		System.out.println(searchphotos);
	}
	
	/**
	 * Method prints all the news AND photos from a specific author.
	 * @param author is the person, you want to see their posts.
	 */
	public void search(String author) {
		ArrayList <News> search = new ArrayList<News>();
		for (News n : this.news) {
			if (n.getAuthor().equals(author)) {
				search.add(n);
			}
		}
		System.out.println(search);
	}
}