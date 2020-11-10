package test1110;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KeycodeEx extends JFrame {
	JPanel contentPane =new JPanel();
	JLabel la=new JLabel();
	
	KeycodeEx(){
		setTitle("key code 예제: f1키 초록색 , %키 노란색");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(contentPane);
		contentPane.addKeyListener(new MykeyListener());
		contentPane.add(la);
		setSize(300, 150);
		setVisible(true);
		contentPane.requestFocus();
	}
	
	class MykeyListener extends KeyAdapter{
		
		public void keyPressed(KeyEvent e) {
			la.setText(e.getKeyText(e.getKeyCode()));
			if(e.getKeyChar()=='%')
				contentPane.setBackground(Color.yellow);
			else if(e.getKeyCode()==KeyEvent.VK_F1)
				contentPane.setBackground(Color.green);
		}
	}
	public static void main(String [] args) {
		new KeycodeEx();
		
	}
}
