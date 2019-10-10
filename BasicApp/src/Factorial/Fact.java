package Factorial;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=1,a,num;
		Scanner ss =new Scanner(System.in);
		System.out.println("enter a no");
		
	 num=ss.nextInt();
	 a=num;
		while(a>0)
		{
			fact*=a;
			a--;
		}
		
		
System.out.println("factorial of a "+num+" is "+fact);
	}

}
