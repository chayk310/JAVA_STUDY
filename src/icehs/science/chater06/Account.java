package icehs.science.chater06;

public class Account {
	String accountName;
	String accountNum;
	int balance;
	
	public void deposit(int money) {
		System.out.println( money + " �� �Ա��մϴ�." );
		if ( money >= 0 ) {
		balance += money;
		printBalance();
		}else {
			System.out.println("[����] �ݾ��� ������ �Է��� �� �����ϴ�.");
			printBalance();
		}
	}
	
	public int withdraw(int money) {
		System.out.println( money + " �� ����մϴ�." );
		if ( money < 0 ) {
			System.out.println("[����] �ݾ��� ������ �Է��� �� �����ϴ�.");
			printBalance();
			return 0;
		}else if( money > balance ) {
			System.out.println("[����] �ܾ��� �����մϴ�.");
			printBalance();
			return 0;
		}else {
			balance -= money;
			printBalance();
			return balance;
		}
	}
	
	public void printAccountInfo() {
		System.out.println("���� " + accountNum + "(������ : " + accountName + " )"  );
		printBalance();
	}
	public void printBalance() {
		System.out.println("�ܾ� : " + balance + "��");
	}
}
