package test0925;

public class Total_tire {
	Tire frontLeftTire=new Hankook();
	Tire frontRightTire=new Hankook();
	Tire BackLeftTire=new Hankook();
	Tire BackRightTire=new Hankook();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		BackLeftTire.roll();
		BackRightTire.roll();
	}
}

