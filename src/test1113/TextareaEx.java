package test1113;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;

public class TextareaEx extends JFrame{
	Container contentPane;
	
	TextareaEx(){
		setTitle("ец");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane=getContentPane();
		contentPane.add(new myCenerpanel(),BorderLayout.CENTER);
		setSize(300,300);
		setVisible(true);
		
	}
}
