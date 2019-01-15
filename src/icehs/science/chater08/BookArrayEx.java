package icehs.science.chater08;

public class BookArrayEx {

	public static void main(String[] args) {
		Book [] books = {
				new Book("습관의 힘", 16000),
				new Book("빅 픽쳐", 12000),
				new Book("7년 후", 13500) 
			};
		
		for ( int i = 0 ; i < books.length ; i++ ) {
			books[i].printBookInfo();
		}
	}

}
