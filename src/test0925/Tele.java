package test0925;

public class Tele implements Remote{
	private int volume;
	
	public void turnOn() {
		System.out.println("tv�� �մϴ�.");
	}
	public void turnOff() {
		System.out.println("tv ���ϴ�.");
	}
	public void setVolume(int volume) {
		if(volume>Remote.Max) {
			this.volume=Remote.Max;
		}
		else if(volume<Remote.Min) {
			this.volume=Remote.Min;
		}
		else {
			this.volume=volume;
		}
		System.out.println("���� tv ���� "+this.volume);
	}

}
