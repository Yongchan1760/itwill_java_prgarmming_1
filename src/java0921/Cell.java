package java0921;

public class Cell {
	String model;
	String color;
	
	void poweron() {
		System.out.println("전원 킴");
	}
	void poweroff() {
		System.out.println("전원 끔");
	}
	void bell() {
		System.out.println("벨이 울립니다");
	}
	void sendvoice(String message) {
		System.out.println("자기"+message);
	}
	void receivevoice(String message) {
		System.out.println("상대방"+message);
	}
	void hangup() {
		System.out.println("전화 끊어");
	}
	
}
