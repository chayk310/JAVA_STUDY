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
		System.out.println(">> 이자를 지급합니다.");
		System.out.println("이자 : " + interest + "원");
		this.balance += interest;
		printAccountInfo();
		return interest;
	}
	
	public void deposit(int money) {
		System.out.println(">>" + money + "원 입금합니다.");
		if ( money < 0) {
			System.out.println("[에러] 음수는 입력할 수 없습니다.");
		}else {
			this.balance += money;
		}
		printAccountInfo();
	}
	
	public void withdraw(int money) {
		System.out.println(">>" + money + "원 출금합니다.");
		if ( money < 0) {
			System.out.println("[에러] 음수는 입력할 수 없습니다.");
		}else if( money > balance ){
			System.out.println("[에러] 잔액이 부족합니다.");
		}else {
			this.balance -= money;
		}
		printAccountInfo();
	}
	
	public void printAccountInfo() {
		System.out.println("계좌 정보  : " + this.account + ", 잔액 : " + this.balance + "원, 이자율 : " + this.interestRate + "%" );
		System.out.println();
	}
	
}
