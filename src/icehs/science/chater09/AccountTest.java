package icehs.science.chater09;

public class AccountTest {

	public static void main(String[] args) {
		FundAccount fund = new FundAccount("111-2222", "ȫ�浿", 5000000, 4.7);
		
		fund.setNumber( "111-2222" );
		fund.setName( "ȫ�浿" );
		fund.setBalance( 5000000 );
		fund.setEarningRate( 4.7 );
		
		fund.openAccount();
//		fund.earnMoney();

	}

}
