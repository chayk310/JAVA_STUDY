package icehs.science.chater08;

public class Student {
	private String name;
	private String id;
	private String phoneNo;
	
	public Student(String name, String id, String phoneNo) {
		this.name = name;
		this.id = id;
		this.phoneNo = phoneNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public void printStudentInfo() {
		System.out.println(this.name + " (" + this.id + ") / 전화번호 : " + this.phoneNo );
	}
}
