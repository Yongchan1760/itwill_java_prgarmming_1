package test0925;

public class Aud implements Remote{
	private int volume;
	
	public void turnOn() {
		System.out.println("au¸¦ ÄÕ´Ï´Ù.");
	}
	public void turnOff() {
		System.out.println("au ²ü´Ï´Ù.");
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
		System.out.println("ÇöÀç au º¼·ý "+this.volume);
	}

}
