package test1019;

import java.awt.Toolkit;

public class Beep1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toolkit toolkit =Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println("¶ò");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}

}
