package excceptionhandling;

import java.util.Scanner;

class Abc
{
void check(int a,int b)
{
	if(b==0)
	{
		throw new ArithmeticException("zero se nai hoga devide "); 
	}
	else
	{
		System.out.println(a/b);
	}
}
}

public class Exceptionhandlingwiththrow {
public static void main(String[] args) {
	Abc c=new Abc();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a no for divide :");
	int a=sc.nextInt();
	System.out.println("enter a no whitch devide :");
	int b=sc.nextInt();
	c.check(a, b);
	
}
}
