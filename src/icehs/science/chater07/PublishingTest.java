package icehs.science.chater07;

public class PublishingTest {

	public static void main(String[] args) {
		Publication publ = new Publication();
		
		publ.setTitle("��ȭ �ﱹ��");
		publ.setPrice(5000);
		publ.setPage(300);
		
		System.out.println("==== ���ǹ� ������ �����մϴ�. ====");
		publ.setPage(-1000);
		publ.setPrice(-5000);
		//
		
		System.out.println("���ǹ� ���� : " + publ.getTitle() + " ( " + publ.getPrice() + " ��, " + publ.getPage() + " page )");
		// = publ.printPublicationInfo();

	}

}
