package java0921;

public class Cell {
	String model;
	String color;
	
	void poweron() {
		System.out.println("���� Ŵ");
	}
	void poweroff() {
		System.out.println("���� ��");
	}
	void bell() {
		System.out.println("���� �︳�ϴ�");
	}
	void sendvoice(String message) {
		System.out.println("�ڱ�"+message);
	}
	void receivevoice(String message) {
		System.out.println("����"+message);
	}
	void hangup() {
		System.out.println("��ȭ ����");
	}
	
}
