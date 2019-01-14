package icehs.science.chater06;

public class Account {
	String accountName;
	String accountNum;
	int balance;
	
	public void deposit(int money) {
		System.out.println( money + " 원 입금합니다." );
		if ( money >= 0 ) {
		balance += money;
		printBalance();
		}else {
			System.out.println("[에러] 금액은 음수를 입력할 수 없습니다.");
			printBalance();
		}
	}
	
	public int withdraw(int money) {
		System.out.println( money + " 원 출금합니다." );
		if ( money < 0 ) {
			System.out.println("[에러] 금액은 음수를 입력할 수 없습니다.");
			printBalance();
			return 0;
		}else if( money > balance ) {
			System.out.println("[에러] 잔액이 부족합니다.");
			printBalance();
			return 0;
		}else {
			balance -= money;
			printBalance();
			return balance;
		}
	}
	
	public void printAccountInfo() {
		System.out.println("계좌 " + accountNum + "(예금주 : " + accountName + " )"  );
		printBalance();
	}
	public void printBalance() {
		System.out.println("잔액 : " + balance + "원");
	}
}
