package calculator;
import javax.swing.*;

public class Main{

	public static void main(String[] args){
		UserInterface ui = new UserInterface();
		
		ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit command
		ui.setSize(500,300); //setting window size
		ui.setVisible(true); //making it visible
		
		System.out.println("+ = addition");
		System.out.println("- = subtraction");
		System.out.println("x = multiplication");
		System.out.println("/ = division");
	}
	

}
