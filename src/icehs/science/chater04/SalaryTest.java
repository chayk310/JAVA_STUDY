package icehs.science.chater04;

public class SalaryTest {

	public static void main(String[] args) {
		long salary = 1000000L;
		long bonus = ( salary / 5 ) * 4;
		
		salary *= 12; //����
		
		long salaryTax = salary/10;
		double bonusTax = bonus * 0.055;
		long longBonusTax = (long) bonusTax ;


		System.out.println("���� : " + salary + ", ���� ���� : " + ( salary - salaryTax ));
		System.out.println("���ʽ� : " + bonus + ", ���� ���ʽ� : " + ( bonus - longBonusTax ));
		System.out.println("���޾� : " + (salary - salaryTax + bonus - longBonusTax ) );

	}

}
