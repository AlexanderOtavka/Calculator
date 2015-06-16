package calculator;
import java.awt.*;

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
		
		JFrame windowOne = new JFrame();
		
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
		
		add(windowOne);
		
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
		
		add(add);
		add(sub);
		add(mul);
		add(div);
		
	}

}
