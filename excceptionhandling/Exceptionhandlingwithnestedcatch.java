package excceptionhandling;

public class Exceptionhandlingwithnestedcatch {
public static void main(String[] args) {
String a="pragya";

try 
	{

		System.out.println(a.charAt(7));
	
	}
	catch(ArrayIndexOutOfBoundsException ae)
	{
		System.out.println("chal jayega");
	}
	catch(StringIndexOutOfBoundsException s)
	{
		System.out.println("chal jayega part 2");
	}
	catch(ArithmeticException A)
	{
		System.out.println("ho gaya handle exception");
	}
}
}
