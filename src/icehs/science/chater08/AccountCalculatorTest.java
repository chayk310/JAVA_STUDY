package icehs.science.chater08;

public class AccountCalculatorTest {

	public static void main(String[] args) {
			Account [] acc = {
				new Account("111-2222-555X", 10000, 4.5),
				new Account("111-2222-555X", 20000, 4.5),
				new Account("111-2222-555X", 30000, 4.5),
				new Account("111-2222-555X", 40000, 4.5),
				new Account("111-2222-555X", 50000, 4.5)
			};
			
			for ( int i = 0 ; i < acc.length ; i++ ) {
				System.out.println("���¹�ȣ : " + acc[i].getName() + " / �ܾ� : " + acc[i].getBalance() + "�� / ���� : " + acc[i].getInterestRate() );
			}
			
			System.out.println("������ �����մϴ�.");
			
			for (int i = 0 ; i < acc.length ; i++) {
				acc[i].setInterestRate( 3.7 );
			}
			
			for (int i = 0 ; i < acc.length ; i++) {
				System.out.println("���¹�ȣ : " + acc[i].getName() + " / ���� : " + acc[i].getInterestRate() + " / �ܾ� : " + (acc[i].getBalance() + acc[i].calcuateInterst()) );
			}
	}

}
