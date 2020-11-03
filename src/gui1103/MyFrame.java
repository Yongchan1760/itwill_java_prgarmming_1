package gui1103;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	MyFrame(){
		setTitle("°í¾çÀÌ");
		setSize(500,700);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		
			new MyFrame();
			
			while(true) {
				System.out.println("go");
			}
	}

}
