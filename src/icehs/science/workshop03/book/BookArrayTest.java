package icehs.science.workshop03.book;

public class BookArrayTest {

	public static void main(String[] args) {
		Book[] books = {
				new Book("���� �Ƿ��� ����","���׳�"),
				new Book("�̰��� �۾���", "��Ű ���ν�"),
				new Book("2222222222222", "�α��� ã�Ƽ�", "��ȿ��", 19500),
				new Book("3333333333333", "�ι��� ���� ����", "������", 14800),
				new Book("9876543219876", "ȥ�ڰ� �Ǵ� å��", "�ֿ�ȣ", 15000, "2016��02��29��"),
				new Book("1111111111111", "���� ������ �ູ", "����", 14000, "2016��01��25��"),
				new Book("4444444444444", "�Ϲ��� ���� 4�� ��", "���̽���", 14000, "2014��12��29��")
		};

		System.out.println(">> ���� ���");
		for( int i = 0 ; i < books.length ; i++) {
			books[i].printBookInfo();
		}
	}

}
