package icehs.science.chater07;

public class PublishingTest2 {

	public static void main(String[] args) {
		Publication.printHeader();
		
		Publication samguggi = new Publication();
		samguggi.setTitle("�ﱹ��");
		samguggi.setPrice(5000);
		samguggi.setPage(300);
		samguggi.printPublicationInfo();
		
		Publication piStory = new Publication();
		piStory.setTitle("���� �̾߱�");
		piStory.setPrice(8400);
		piStory.setPage(280);
		piStory.printPublicationInfo();

	}

}
