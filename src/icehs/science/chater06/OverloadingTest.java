package icehs.science.chater06;

public class OverloadingTest {

	public static void main(String[] args) {
		Overloading overloading = new Overloading();
		
		overloading.addtion(1000, 365);
		overloading.addtion(4.3, 1.8);
		overloading.addtion("ANT", "AND");
		overloading.addtion("�����", 16);
		overloading.addtion(16, "�����"); //ctrl ������ addtion Ŭ��
		
	//	overloading.addtion(1.5, "aaa"); double, String

	}

}
