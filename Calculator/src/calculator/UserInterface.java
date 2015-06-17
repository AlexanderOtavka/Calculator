package calculator;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// User Interface now extends MathUI, so it can call addition, etc...
// Turns out I didn't need to do any static stuff.  Also, you can
// probably just get rid of the MathUI class, and add its methods to 
// this class, unless you want to inherit from it again.
@SuppressWarnings("serial")
public class UserInterface extends MathUI {
	private JButton one;
	private JButton two;
	private JButton three;
	private JButton four;
	private JButton five;
	private JButton six;
	private JButton seven;
	private JButton eight;
	private JButton nine;
	private JButton ten;
	
	private JButton add;
	private JButton sub;
	private JButton mul;
	private JButton div;
	
	public UserInterface(){
		super ("Calculator");
		setLayout (new FlowLayout());
		
		one =  new JButton("1");
		two =  new JButton("2");
		three =  new JButton("3");
		four =  new JButton("4");
		five =  new JButton("5");
		six =  new JButton("6");
		seven =  new JButton("7");
		eight =  new JButton("8");
		nine =  new JButton("9");
		ten =  new JButton("10");
		
		add(one);
		add(two);
		add(three);
		add(four);
		add(five);
		add(six);
		add(seven);
		add(eight);
		add(nine);
		add(ten);
		
		add = new JButton("+");
		sub = new JButton("-");
		mul = new JButton("x");
		div = new JButton("/");
		
		add(add);
		add(sub);
		add(mul);
		add(div);
		
		Handler handler = new Handler();
		one.addActionListener(handler);
		two.addActionListener(handler);
		three.addActionListener(handler);
		four.addActionListener(handler);
		five.addActionListener(handler);
		six.addActionListener(handler);
		seven.addActionListener(handler);
		eight.addActionListener(handler);
		nine.addActionListener(handler);
		ten.addActionListener(handler);
		
		add.addActionListener(handler);
		sub.addActionListener(handler);
		mul.addActionListener(handler);
		div.addActionListener(handler);
		
	}
	
	public class Handler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event){
			if(event.getSource() == add){
				System.out.println("+");
				addition();
			}
			
			if(event.getSource() == sub){
				System.out.println("-");
				subtraction();
			}
			
			if(event.getSource() == mul){
				System.out.println("x");
				multiplication();
			}
			
			if(event.getSource() == div){
				System.out.println("/");
				division();
			}
		}
	}
}



