package excceptionhandling;

import java.util.Scanner;

class Webinar
{
	void check(int age)
	{
		if(age<12)
		{
			throw new ArithmeticException("you are under age for this webinar");
		}
		else if(age>23)
		{
			throw new ArithmeticException("you are over age for this webinar");
		}
		else
		{
			System.out.println("you are eligible for webinar");
		}
	}
}
public class Exceptionforwebinar {
public static void main(String[] args) {
	Webinar w=new Webinar();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your age :");
	int age=sc.nextInt();
	w.check(age);
}
}
