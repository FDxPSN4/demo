package excceptionhandling;

import java.util.Scanner;

class MaxException extends RuntimeException
{
	MaxException()
	{
		super();
	}
}
class Maxexceeds
{
	void check(int a)
	{
		if(a>5)
		{
			throw new MaxException();
		}
		else
		{
			System.out.println("a is under limit");
		}
		
	}
}

public class Customexceptionformax {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Maxexceeds m=new Maxexceeds();
	System.out.println("enter a no :");
	int a=sc.nextInt();
    m.check(a);	
} 
}
