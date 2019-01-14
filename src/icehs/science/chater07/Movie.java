package icehs.science.chater07;

public class Movie {
	
	String title;
	String director;
	String genre;
	
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
