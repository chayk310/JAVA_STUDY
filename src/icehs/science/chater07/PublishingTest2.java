package icehs.science.chater07;

public class PublishingTest2 {

	public static void main(String[] args) {
		Publication.printHeader();
		
		Publication samguggi = new Publication();
		samguggi.setTitle("삼국지");
		samguggi.setPrice(5000);
		samguggi.setPage(300);
		samguggi.printPublicationInfo();
		
		Publication piStory = new Publication();
		piStory.setTitle("파이 이야기");
		piStory.setPrice(8400);
		piStory.setPage(280);
		piStory.printPublicationInfo();

	}

}
