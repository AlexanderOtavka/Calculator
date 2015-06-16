package calculator;
import java.util.Scanner;

public class Methods {
	
	static int add1;
	static int add2;
	
	static int sub1;
	static int sub2;
	
	static int mul1;
	static int mul2;
	
	static int div1;
	static int div2;
	
	static Methods methodCaller = new Methods();
	Scanner userInput = new Scanner(System.in);
	
	public void main(){
		String firstInput;
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("What operation would you like to do?");
		firstInput = userInput.nextLine();
		
		if(firstInput.equalsIgnoreCase("+")){
			methodCaller.addition();
			
		}else if(firstInput.equalsIgnoreCase("-")){
			methodCaller.subtraction();

		}else if(firstInput.equalsIgnoreCase("x")){
			methodCaller.multiplication();
			
		}else if(firstInput.equalsIgnoreCase("/")){
			methodCaller.division();
		}
	}
	
	public void addition(){
		System.out.println("First Number:");
		add1 = userInput.nextInt();
		System.out.println("Second Number:");
		add2 = userInput.nextInt();
		
		System.out.println(add1 + add2);
		
		methodCaller.main();
	}
	
	public void subtraction(){
		System.out.println("First Number:");
		sub1 = userInput.nextInt();
		System.out.println("Second Number:");
		sub2 = userInput.nextInt();
		
		System.out.println(sub1 - sub2);
		
		methodCaller.main();
	}
	
	public void multiplication(){
		System.out.println("First Number:");
		mul1 = userInput.nextInt();
		System.out.println("Second Number:");
		mul2 = userInput.nextInt();
		
		System.out.println(mul1 * mul2);
		
		methodCaller.main();
	}
	
	public void division(){
		System.out.println("First Number:");
		div1 = userInput.nextInt();
		System.out.println("Second Number:");
		div2 = userInput.nextInt();
		
		System.out.println(div1 / div2);
		
		methodCaller.main();
	}
}
