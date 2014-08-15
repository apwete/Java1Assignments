package part_1;

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

public class Unit07_Prog1 extends JFrame {

	public Unit07_Prog1() {
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		setLayout(new GridLayout(2, 1, 10, 10));
		p1.setLayout(new GridLayout(1, 3));
		p2.setLayout(new GridLayout(1, 3));
		// add to panel 1
		p1.setBorder(BorderFactory.createTitledBorder("Panel 1"));
		p1.add(new JButton("Button 1"));
		p1.add(new JButton("Button 2"));
		p1.add(new JButton("Button 3"));
		// add to panel 2
		p2.setBorder(BorderFactory.createTitledBorder("Panel 2"));
		p2.add(new JButton("Button 4"));
		p2.add(new JButton("Button 5"));
		p2.add(new JButton("Button 6"));
		// add to frame
		add(p1);
		add(p2);
	}

	public static void main(String[] args) {
		// Declarations
		Unit07_Prog1 frame = new Unit07_Prog1();
		// create frame
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
