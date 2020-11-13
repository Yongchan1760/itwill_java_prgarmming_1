package test1113;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSlider;
import javax.swing.JScrollBar;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DDD extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DDD frame = new DDD();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DDD () {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 663, 555);
		
		setTitle("ец");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		JMenuBar menu1 = new JMenuBar();
		menu1.setToolTipText("\uD30C\uC77C");
		setJMenuBar(menu1);
		
		JMenu mnNewMenu = new JMenu("\uD30C\uC77C");
		menu1.add(mnNewMenu);
		
		JFileChooser fc;
		JMenuItem mntmNewMenuItem = new JMenuItem("\uC5F4\uAE30");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem saveitem = new JMenuItem("\uC800\uC7A5");
		mnNewMenu.add(saveitem);
		
		JMenuItem exititem = new JMenuItem("\uB098\uAC00\uAE30");
		mnNewMenu.add(exititem);
		
		JMenu Menu_2 = new JMenu("\uC5D0\uB514\uD2B8");
		menu1.add(Menu_2);
		
		JMenuItem coloritem = new JMenuItem("\uC0C9 \uC120\uD0DD");
		Menu_2.add(coloritem);
		
		setSize(300,300);
		setVisible(true);
	}

}
