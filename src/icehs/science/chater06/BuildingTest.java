package icehs.science.chater06;

public class BuildingTest {

	public static void main(String[] args) {
		// stack lifo (lost in frist out) ex) ctrl + z , ���ͳ� �湮��� - ���� �ֱ��� ���� ����
		// int long double
		
		// heap fifo (frist in frist out) ex)�μ�
		// ��ü
		Building building1 = new Building(); //Ŭ������ ������ = new Ŭ������();
		
		building1.name = "������Ÿ��";
		building1.address = "������";
		building1.totalFloor = 5;
		
		System.out.println("�ǹ��� : " + building1.name );
		System.out.println("�ּ� : " + building1.address );
		System.out.println("��ü �� �� : " + building1.totalFloor );
		
		building1.moveElevator();
		building1.changeAddress( "�����" );
		
		System.out.println("�� �ּ� : " + building1.address);
		
	}

}
