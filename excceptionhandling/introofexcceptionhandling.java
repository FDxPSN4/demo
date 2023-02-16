package excceptionhandling;

public class introofexcceptionhandling {
public static void main(String[] args) {
	int a1[]= {34,7,7,5,7,5};
	int a=87;
	try
	{
	System.out.println(a/0);
}
	catch(ArithmeticException ae)
	{
		System.out.println(ae.getMessage());
	}

	finally
	{
		System.out.println("ye to chalega hi");
	}
	try
	{
   for(int i=0;i<=a1.length;i++)
   {
	   System.out.println(a1[i]);
   }
	}
	catch(ArrayIndexOutOfBoundsException ae)
	{
		System.out.println("exception gaya re baba");
	}

}
}