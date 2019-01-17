package icehs.science.chater09;

public class DoctorTest {

	public static void main(String[] args) {
		
		Dentist dent = new Dentist("ȫ�浿");
		System.out.println(dent.getDepartment() + " : " + dent.getName());
		dent.treatPatient();
		dent.pullOutTeeth();

	}

}
