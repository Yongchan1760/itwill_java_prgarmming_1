package java0921;

public class Cell_1 extends Cell{

	int channel;
	Cell_1(String model,String color, int channel){
		this.model=model;
		this.color=color;
		this.channel=channel;
	}
	
	void turnondmb() {
		System.out.println("ä��"+channel+"���Ž���");
	}
	void changechannel(int channel) {
		System.out.println("ä��"+channel+"����");
	}
	void turnoffdmb() {
		System.out.println("���Ÿ���");
	}
}
