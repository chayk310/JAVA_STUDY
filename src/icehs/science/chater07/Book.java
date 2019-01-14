package icehs.science.chater07;

public class Book {
	
	String title; //필드 변수
	String author;
	int price;
	
	Book(){
		
	}
	
	Book( String author ){
		this.author = author;
	}
	
	Book( String title, String author ){
		this( author ); //this ()은 앞에 써야함
		this.title = title;
	}
	
	Book( String title, int price ){   /*로컬 변수*/
		this(title); //this. 가 없으면 필드변수가 로컬변수로 인식됨(필드변수와 로컬변수의 이름이 같을 때)
		this.price = price;
	}
	
	Book( String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	void printBookInfo() {
		System.out.print(title + "  ");
		System.out.print(price + "  ");
		System.out.println(author);
	}
}
