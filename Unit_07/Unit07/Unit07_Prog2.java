package part_2;

/**
 * @Class: CIST 2371 Introduction to JAVA 
 * @Term: Summer 2014 Instructor: Dave Busse 
 * @Description: Solution to Unit 05 Program Due: 7/08/14
 * 
 * @author: William M. Driver
 * @version: 1.0
 * 
 *           By turning in this code, I pledge: 1) That I have completed the
 *           programming assignment independently. 2) I have not copied the code
 *           from a student or any source. 3) I have not given my code to any
 *           student.
 */

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Unit07_Prog2 extends JFrame implements ActionListener {
	// create 6 buttons
	private JButton btn1 = new JButton("Button 1");
	private JButton btn2 = new JButton("Button 2");
	private JButton btn3 = new JButton("Button 3");
	private JButton btn4 = new JButton("Button 4");
	private JButton btn5 = new JButton("Button 5");
	private JButton btn6 = new JButton("Button 6");

	/**
	 * @Description: Constructor Populates the frame
	 */
	public Unit07_Prog2() {
		setLayout(new GridLayout(2, 1, 10, 10));
		// create panel 1 and components
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(1, 3));
		// create panel 2 and components
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(1, 3));
		// add to panel 1
		p1.setBorder(BorderFactory.createTitledBorder("Panel 1"));
		p1.add(btn1);
		p1.add(btn2);
		p1.add(btn3);
		// add to panel 2
		p2.setBorder(BorderFactory.createTitledBorder("Panel 2"));
		p2.add(btn4);
		p2.add(btn5);
		p2.add(btn6);
		// add to frame
		add(p1);
		add(p2);
		// add listeners
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
	}

	/**
	 * @Description: Main Method
	 */
	public static void main(String[] args) {
		// Declarations
		Unit07_Prog2 frame = new Unit07_Prog2();
		// create frame
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	/**
	 * @Description: On click action event
	 */
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn1) {
			System.out.println("The user pressed Button 1");
		} else if (e.getSource() == btn2) {
			System.out.println("The user pressed Button 2");
		} else if (e.getSource() == btn3) {
			System.out.println("The user pressed Button 3");
		} else if (e.getSource() == btn4) {
			System.out.println("The user pressed Button 4");
		} else if (e.getSource() == btn5) {
			System.out.println("The user pressed Button 5");
		} else {
			System.out.println("The user pressed Button 6");
		}
	}

}
