package test1110;

import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;
import javax.swing.JPanel;

public class KeyListenerEx extends JFrame{
	JPanel contentpane =new JPanel();
	JLabel[] keymessage;
	
	KeyListenerEx(){
		setTitle("ketlistener¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(contentpane);
		contentpane.addKeyListener(new Mykeylistener());
		
		keymessage= new JLabel[3];
		keymessage[0]=new JLabel("getkeycode()");
		keymessage[1]=new JLabel("getkeychar()");
		keymessage[2]=new JLabel("getkeytext()");
		
		for (int i = 0; i < keymessage.length; i++) {
			contentpane.add(keymessage[i]);
			keymessage[i].setOpaque(true);
			keymessage[i].setBackground(Color.CYAN);
		}
		
		setSize(300,150);
		setVisible(true);
		contentpane.setFocusable(true);
		contentpane.requestFocus();
	}
	class Mykeylistener extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			int keyCode=e.getKeyCode();
			char keyChar=e.getKeyChar();
			keymessage[0].setText(Integer.toString(keyCode));
			
			keymessage[1].setText(Character.toString(keyChar));
			keymessage[2].setText(e.getKeyText(keyCode));
		}
	}
	
	public static void main(String [] args) {
		new KeyListenerEx();

		}
	}

