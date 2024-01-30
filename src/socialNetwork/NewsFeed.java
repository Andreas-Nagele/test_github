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
	
	public void add(News n) {
		if (!this.news.contains(n)) {
			this.news.add(n);
		}
	}
		
	public void remove(News n) {
		this.news.remove(n);
	}

}