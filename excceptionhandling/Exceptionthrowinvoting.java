package excceptionhandling;

import java.util.Scanner;

class Voting
{
void check(int age)
{
	if(age<18 && age>100)
	{
		throw new ArithmeticException("you are not eligible for voting");
	}
	else
	{
		System.out.println("you are eligible for voting");
	}
}
}
public class Exceptionthrowinvoting {
public static void main(String[] args) {
	Voting v=new Voting();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a age :");
	int age=sc.nextInt();
	v.check(age);
}
}
