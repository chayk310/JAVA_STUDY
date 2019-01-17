package icehs.science.chater09;

public class Account { // = public class Account extends Object
	private String number;
	private String name;
	private int balance;

	public Account(String number, String name, int balance) {
		this.number = number;
		this.name = name;
		this.balance = balance;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void openAccount() {
		System.out.println("계좌를 개설합니다.");
	}
	
	public String toString() {
		String str = "계좌 번호 : " + this.number + "\n";
		str += "예금주 : " + this.name + "\n";
		str += "잔액 :ㅣ " + this.balance + "원";
		return str;
	}
}
