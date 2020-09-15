package sang1;

public class Cal_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal_1 c1=new Cal_1();
		c1.poweron();
		int result=c1.plus(10,20);
		System.out.println(result);
		double result2=c1.divide(3, 6);
		System.out.println(result2);
		c1.poweroff();
	}

}
