package icehs.science.chater06;

public class AccountTest {

	public static void main(String[] args) {
		Account account = new Account();
		
		account.accountName = "ȫ�浿";
		account.accountNum = "123-456789";
		account.balance = 10000;
		
		account.printAccountInfo();
		
		account.deposit(20000);
		
		account.deposit(-20000);
		
		account.withdraw(-20000);
		
		account.withdraw(45000);
	}

}
