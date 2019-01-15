package icehs.science.chater07;

public class Movie {
	
	private String title; //�ʵ� private ���� ����
	private String director;
	private String genre;
	
	public void setTitle(String title) { // setter ����
		this.title = title;
	}
	
	public String getTitle() { // getter ����
		return title; // = return this.title
	}
	
	public void setDiretor(String director) {
		this.director = director;
	}
	
	public String getDirector() {
		return director;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public Movie() {

	}

	public Movie(String title, String director) {
		this.title = title;
		this.director = director;
	}

	public Movie(String title, String director, String genre) {
		this.title = title;
		this.director = director;
		this.genre = genre;
	}
	
	void printMovieInfo() {
		System.out.print(title + "  ");
		System.out.print(director + "  ");
		System.out.println(genre);
	}
	
	
	
}
