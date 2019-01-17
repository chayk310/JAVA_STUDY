package icehs.science.workshop03.account;

public class Account {
	private String account;
	private int balance;
	private double interestRate;
	
	public Account() {
	}

	public Account(String account, int balance, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public int calculateInterest() {
		int interest =(int)(( this.balance * this.interestRate) / 100);
		System.out.println(">> ���ڸ� �����մϴ�.");
		System.out.println("���� : " + interest + "��");
		this.balance += interest;
		printAccountInfo();
		return interest;
	}
	
	public void deposit(int money) {
		System.out.println(">>" + money + "�� �Ա��մϴ�.");
		if ( money < 0) {
			System.out.println("[����] ������ �Է��� �� �����ϴ�.");
		}else {
			this.balance += money;
		}
		printAccountInfo();
	}
	
	public void withdraw(int money) {
		System.out.println(">>" + money + "�� ����մϴ�.");
		if ( money < 0) {
			System.out.println("[����] ������ �Է��� �� �����ϴ�.");
		}else if( money > balance ){
			System.out.println("[����] �ܾ��� �����մϴ�.");
		}else {
			this.balance -= money;
		}
		printAccountInfo();
	}
	
	public void printAccountInfo() {
		System.out.println("���� ����  : " + this.account + ", �ܾ� : " + this.balance + "��, ������ : " + this.interestRate + "%" );
		System.out.println();
	}
	
}
