package icehs.science.chater07;

public class ItBookTest {

	public static void main(String[] args) {
		ItBook sql = new ItBook("SQL Plus", 50000, 5.5);
		System.out.println(sql.NO_OF_OBJECT);
		ItBook java = new ItBook("JAVA 2.0", 28000, 3.2);
		System.out.println(java.NO_OF_OBJECT);
		ItBook jsp = new ItBook("JSP Servlet", 37000, 6.9 );
		System.out.println(jsp.NO_OF_OBJECT);
		System.out.println(ItBook.NO_OF_OBJECT);
		
		sql.printItBookInfo();
		java.printItBookInfo();
		jsp.printItBookInfo();
		
		System.out.println();
		System.out.println("SQL 정가와 할인율을 변경합니다.");
		sql.setPrice(55000);
		sql.setDiscountRate(9.5);
		sql.printItBookInfo();
		
		System.out.println();
		System.out.println("JAVA 2.0 정가를 변경합니다.");
		java.setPrice(33000);
		java.printItBookInfo();
		
		System.out.println();
		System.out.println("JSP Servlet 제목과 할인율을 변경합니다.");
		jsp.setTitle("Servlet & JSP");
		jsp.setDiscountRate(12.6);
		jsp.printItBookInfo();
		

	}

}
