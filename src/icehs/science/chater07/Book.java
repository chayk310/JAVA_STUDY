package icehs.science.chater07;

public class Book {
	
	String title; //�ʵ� ����
	String author;
	int price;
	
	Book(){
		
	}
	
	Book( String author ){
		this.author = author;
	}
	
	Book( String title, String author ){
		this( author ); //this ()�� �տ� �����
		this.title = title;
	}
	
	Book( String title, int price ){   /*���� ����*/
		this(title); //this. �� ������ �ʵ庯���� ���ú����� �νĵ�(�ʵ庯���� ���ú����� �̸��� ���� ��)
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
