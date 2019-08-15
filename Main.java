import java.io.*;

public class Main
{
	public static void main(String[] args)throws IOException 
	{
	    DataInputStream Calculator = new DataInputStream(System.in);
	    
	    int FirstNumber, SecondNumber;
	    int Sum, Diff, Multiply;
	    float Divide;
	    System.out.println("Enter First Number :");
	    FirstNumber = Integer.parseInt(Calculator.readLine());
	    System.out.println("Enter Second Number :");
	    SecondNumber = Integer.parseInt(Calculator.readLine());
	    
	    Sum = FirstNumber + SecondNumber;
	    Diff = FirstNumber - SecondNumber;
	    Multiply = FirstNumber * SecondNumber;
	    Divide = (float)FirstNumber / (float)SecondNumber;
	    
	    System.out.println("The Sum of " + FirstNumber + "and " + SecondNumber + " is " + Sum);
	    System.out.println("The Difference of " + FirstNumber + " and " + SecondNumber + " is " + Diff);
	    System.out.println("The Product of " + FirstNumber + " and " + SecondNumber + " is " + Multiply);
	    System.out.println("The Quotient of " + FirstNumber + " and " + SecondNumber + " is " + Divide);
	}
}
