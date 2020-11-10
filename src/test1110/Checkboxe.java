package test1110;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Checkboxe extends JFrame{
	JCheckBox c1,c2,c3;
	JLabel sumlabel;
	int sum=0;
	
	Checkboxe(){
		setTitle("dddd");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		add(new JLabel("��� ���� 1���� , �� ���� ��¥, ü�� 1��"));
		c1= new JCheckBox("���");
		c2=new JCheckBox("��");
		c3=new JCheckBox("ü��");
		
		MyitemListener l=new MyitemListener();
		c1.addItemListener(l);
		c2.addItemListener(l);
		c1.addItemListener(l);
		
		
		add(c1);
		add(c2);
		add(c3);
		
		sumlabel=new JLabel("�հ�� ....");
		add(sumlabel);
		
				
		setSize(500,500);
		setVisible(true);
	}
	
	class MyitemListener implements ItemListener{
	 @Override
	 public void itemStateChanged(ItemEvent e) {
		if(e.getItem()==c1) {
			 if(e.getStateChange()==ItemEvent.SELECTED) {
					sum+=100;
				}
			 else {
				 sum-=100;
			 }			
		}
	
		if(e.getItem()==c2) {
			 if(e.getStateChange()==ItemEvent.SELECTED) {
					sum+=200;
				}
			 else {
				 sum-=200;
			 }	
			 
		}
		if(e.getItem()==c3) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
						sum+=2000;
					}
				else {
					 sum-=2000;
				 }			
		}
		
		
		 sumlabel.setText("�հ�� : "+sum);
		 JCheckBox c1= (JCheckBox)e.getSource();
	 }
	}
	
	public static void main(String[] args) {
		new Checkboxe();

	}

}
