package calculator;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class userInterface extends JFrame{
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
	
	public userInterface(){
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
		
		theHandler handler = new theHandler();
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
	
	public class theHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			if(event.getSource() == add){
				System.out.println("+");
				//ERROR (needs fixing)
				methodCaller.addition();
			}
			
			if(event.getSource() == sub){
				System.out.println("-");
			}
			
			if(event.getSource() == mul){
				System.out.println("x");
			}
			
			if(event.getSource() == div){
				System.out.println("/");
			}
			
			
		}
	}
	
	}



