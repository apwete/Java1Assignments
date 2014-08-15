import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

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

public class Unit08_Prog1 extends JFrame implements ActionListener {
	//add Radio Button (colors)
	ButtonGroup colors = new ButtonGroup();
	JRadioButton red = new JRadioButton("Red");
	JRadioButton yellow = new JRadioButton("Yellow");
	JRadioButton white = new JRadioButton("White");
	JRadioButton gray = new JRadioButton("Grey");
	JRadioButton green = new JRadioButton("Green");
	//add text area
	JTextArea textArea = new JTextArea("Welcome to Java" , 5 , 30);
	//add buttons
	JButton clearBtn = new JButton("Clear");
	JButton quitBtn = new JButton("Quit");
	KeyListener keyListener;

	/**
	 * @Description: populate frame with 3 panels
	 * 
	 *               1st changes colors 2nd edits text 3rd contains two buttons:
	 *               Clear and Quit which have Mnemonics of "C" and "Q"
	 */
	public Unit08_Prog1() {
		setLayout(new BorderLayout());
		//populate ButtonGroup
		colors.add(red);
		colors.add(yellow);
		colors.add(white);
		colors.add(gray);
		colors.add(green);
		// create panel 1 (panel changes text area's color)
		JPanel colorPanel = new JPanel();
		colorPanel.setLayout(new FlowLayout());
		colorPanel.setBorder(BorderFactory.createTitledBorder("Select Message Background"));
		colorPanel.add(red);
		colorPanel.add(yellow);
		colorPanel.add(white);
		colorPanel.add(gray);
		colorPanel.add(green);
		
		//Create panel 2 (add text area to frame)
		JPanel textPanel = new JPanel();
		textPanel.setLayout(new BorderLayout());
		textPanel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		JScrollPane scroll = new JScrollPane(textArea);
	    scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	    textPanel.add(scroll, BorderLayout.CENTER);
		
		//create panel 3 (add buttons to frame)
		JPanel btnPanel = new JPanel();
		btnPanel.add(clearBtn);
		btnPanel.add(quitBtn);
		//add panels
		add(colorPanel, BorderLayout.NORTH);
		add(textPanel, BorderLayout.CENTER);
		add(btnPanel, BorderLayout.SOUTH);
		//add listeners
		red.addActionListener(this);
		yellow.addActionListener(this);
		gray.addActionListener(this);
		white.addActionListener(this);
		green.addActionListener(this);
		
		clearBtn.addActionListener(this);
		quitBtn.addActionListener(this);
		clearBtn.setMnemonic('c');
		quitBtn.setMnemonic('q');
//		addKeyListener((KeyListener) this);
		
		
		
	}
	/** Handle the key typed event from the text field. */
//    public void keyTyped(KeyEvent e) {
//    	int key = e.getKeyCode();
//    	if (key == KeyEvent.VK_C){
//    		textArea.setText("Welcome to Java");
//    	}else if(key == KeyEvent.VK_Q){
//    		System.exit(0);
//    	}
//    }
//     
//    /** Handle the key pressed event from the text field. */
//    public void keyPressed(KeyEvent e) {
//    	int key = e.getKeyCode();
//    	if (key == KeyEvent.VK_C){
//    		textArea.setText("Welcome to Java");
//    	}else if(key == KeyEvent.VK_Q){
//    		System.exit(0);
//    	}
//    }
//     
//    /** Handle the key released event from the text field. */
//    public void keyReleased(KeyEvent e) {
//    	int key = e.getKeyCode();
//    	if (key == KeyEvent.VK_C){
//    		textArea.setText("Welcome to Java");
//    	}else if(key == KeyEvent.VK_Q){
//    		System.exit(0);
//    	}
//    }

	/*
	 * @Description: create frame
	 */
	public static void main(String[] args) {
		// create frame
		Unit08_Prog1 frame = new Unit08_Prog1();
		frame.pack();
		frame.setMinimumSize(new Dimension(400,200));
		frame.setTitle("Unit08_Prog1");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource() == red){
			textArea.setBackground(Color.RED);
		}else if(arg0.getSource() == yellow){
			textArea.setBackground(Color.YELLOW);
		}else if(arg0.getSource() == gray){
			textArea.setBackground(Color.LIGHT_GRAY);
		}else if(arg0.getSource() == white){
			textArea.setBackground(Color.WHITE);
		}else if(arg0.getSource() == green){
			textArea.setBackground(Color.GREEN);
		}else if(arg0.getSource() == clearBtn){
			textArea.setText("Welcome to Java");
		}else if(arg0.getSource() == quitBtn){
			System.exit(0);
		}else{
			textArea.setText("I'm sorry there was an error.  Please try again.");
		}
	}
	
}