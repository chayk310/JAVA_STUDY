package icehs.science.chater06;

public class Building {
	
	String name;
	String address;
	int totalFloor;
	// �Ӽ�(�ɹ� ����) �ʱⰪ�� �൵ ���൵ ��
	
	public void moveElevator(){
		System.out.println("���������͸� �����մϴ�.");
	}
	
	public void changeAddress( String newAddress ) {
		address = newAddress;
	} // ���� (�޼ҵ�)
	
}
