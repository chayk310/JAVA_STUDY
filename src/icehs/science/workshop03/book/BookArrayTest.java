package icehs.science.workshop03.book;

public class BookArrayTest {

	public static void main(String[] args) {
		Book[] books = {
				new Book("조선 실록의 세계","오항녕"),
				new Book("이공계 글쓰기", "유키 히로시"),
				new Book("2222222222222", "인권을 찾아서", "조효제", 19500),
				new Book("3333333333333", "인문학 따라 쓰기", "고정욱", 14800),
				new Book("9876543219876", "혼자가 되는 책들", "최원호", 15000, "2016년02월29일"),
				new Book("1111111111111", "법륜 스님의 행복", "법륜", 14000, "2016년01월25일"),
				new Book("4444444444444", "하버드 새벽 4시 반", "웨이슈잉", 14000, "2014년12월29일")
		};

		System.out.println(">> 도서 출력");
		for( int i = 0 ; i < books.length ; i++) {
			books[i].printBookInfo();
		}
	}

}
