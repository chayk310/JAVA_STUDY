package icehs.science.chater09;

public class AccountTest2 {

	public static void main(String[] args) {
		FundAccount [] fundAcc = {
				new FundAccount("111-2222", "È«±æµ¿", 5000000, 4.7),
				new FundAccount("666-7777", "È«±æ¼ø", 1000000, 2.9)
		};
		
		for ( int i = 0 ; i < fundAcc.length ; i++) {
			fundAcc[i].openAccount();
			System.out.println();
		}

	}

}
