package java0921;

public class Cell_1 extends Cell{

	int channel;
	Cell_1(String model,String color, int channel){
		this.model=model;
		this.color=color;
		this.channel=channel;
	}
	
	void turnondmb() {
		System.out.println("채널"+channel+"수신시작");
	}
	void changechannel(int channel) {
		System.out.println("채널"+channel+"변경");
	}
	void turnoffdmb() {
		System.out.println("수신멈춤");
	}
}
