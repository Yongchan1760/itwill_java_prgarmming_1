package test1110;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class JLabeld extends JFrame{
	
	JLabeld(){
		setTitle("dddd");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel lb1=new JLabel("�Ļ���.");
		ImageIcon icon=new ImageIcon("images/�̹���2.jpg");
		JLabel lb2=new JLabel(icon);
		JLabel lb3=new JLabel("�������ּ���",new ImageIcon("images/ĸó.jpg"),SwingConstants.CENTER);
		
		add(lb1, BorderLayout.NORTH);
		add(lb2, BorderLayout.CENTER);
		add(lb3, BorderLayout.SOUTH);
		setSize(500,500);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new JLabeld();
	}
}
