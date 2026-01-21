package day7;

import java.io.InputStream;
import java.util.Scanner;

public class MultipleInput {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		/*System.out.println("Enter the First number");
		int num1=a.nextInt();
		System.out.println("Enter the second number");
		int num2=a.nextInt();
		System.out.println("Addition of two numbers"+(num1+num2));*/
        
		System.out.println("Enter your name");
		String name=a.next();
		System.out.println("your name is :"+name);
		System.out.println("Enter your age");
		int age=a.nextInt();
		System.out.println("Your age is :"+age);
		System.out.println("Enter the unknown value");
		Object value=a.next();
		System.out.println("Unknown value is :"+value);
	}

	
	}


