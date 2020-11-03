package gui1103;

import java.awt.Color;
import java.awt.Container;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Rom extends JFrame{

	Rom(){
		setTitle("test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Random rn=new Random();
		Container c = getContentPane();
		c.setLayout(null);
		
		for(int i=0;i<=20;i++) {
			JLabel l = new JLabel();
			l.setSize(10,10);
			l.setOpaque(true);
			l.setBackground(new Color(rn.nextInt(256),rn.nextInt(256),rn.nextInt(256)));
			//l.setLocation((int)(Math.random()*200)+50,(int)(Math.random()*200)+50);
			
			
			int x=rn.nextInt(201)+50;//0~250
			int y=rn.nextInt(201)+50;
			
			l.setLocation(x,y);
			c.add(l);
		}
		
		setSize(300, 200);
		setVisible(true);
		
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Rom(); 
	}

}

		
		
		






