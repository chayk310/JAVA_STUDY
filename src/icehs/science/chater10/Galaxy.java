package icehs.science.chater10;

public class Galaxy extends Mobile {
	private String osVerson;

	public String getOsVerson() {
		return osVerson;
	}

	public void setOsVerson(String osVerson) {
		this.osVerson = osVerson;
	}

	public void charge(int time) {
		System.out.println( super.getProduction() + " : ���� ���͸� " + time + "�� ����");
	}
}
