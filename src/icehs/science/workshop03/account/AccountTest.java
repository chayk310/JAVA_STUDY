package icehs.science.workshop03.account;

public class AccountTest {

	public static void main(String[] args) {
		Account account = new Account("441-0290-1203", 500000, 7.3);
		
		System.out.println(">>계좌를 생성합니다.");
		account.printAccountInfo();
		
		account.deposit(20000);
		
		account.calculateInterest();
		
		account.withdraw(150000);
		
		account.withdraw(500000);

	}

}
