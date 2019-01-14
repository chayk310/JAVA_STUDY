package icehs.science.chater07;

public class MovieTest {

	public static void main(String[] args) {
		Movie movie1 = new Movie();
		Movie movie2 = new Movie("트랜스포머", "마이클 베이");
		Movie movie3 = new Movie("아바타", "제임스카메론 ", "SF");
		
		movie1.printMovieInfo();
		movie2.printMovieInfo();
		movie3.printMovieInfo();

	}

}
