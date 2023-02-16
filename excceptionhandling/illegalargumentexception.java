package excceptionhandling;

import java.util.Scanner;



class OutOfRechargeException extends RuntimeException
{
	
	OutOfRechargeException(String s)
	{
		super(s);
	}
	
	OutOfRechargeException()
	{
		super();
	}
}

class Phone 
{
	void call(String s) 
	{
		throw new OutOfRechargeException("you dont make calls because sim is out of recharge");
	}
	void call() 
	{
		throw new OutOfRechargeException();
	}
}


public class illegalargumentexception 
{
	public static void main(String[] args) 
	{
		Phone phone = new Phone();
		
		phone.call("pratyush");
		
	
	}
}
