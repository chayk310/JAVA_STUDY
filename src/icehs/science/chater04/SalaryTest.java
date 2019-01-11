package icehs.science.chater04;

public class SalaryTest {

	public static void main(String[] args) {
		long salary = 1000000L;
		long bonus = ( salary / 5 ) * 4;
		
		salary *= 12; //연봉
		
		long salaryTax = salary/10;
		double bonusTax = bonus * 0.055;
		long longBonusTax = (long) bonusTax ;


		System.out.println("연봉 : " + salary + ", 세후 연봉 : " + ( salary - salaryTax ));
		System.out.println("보너스 : " + bonus + ", 세후 보너스 : " + ( bonus - longBonusTax ));
		System.out.println("지급액 : " + (salary - salaryTax + bonus - longBonusTax ) );

	}

}
