package excceptionhandling;
class BikeOutOfFuelException extends RuntimeException
{
	 BikeOutOfFuelException()
	 {
		 super();
	 }
}
class Fuel
{
	void petrol()
	{
		throw new  BikeOutOfFuelException();
	}
}
public class Customexception {
public static void main(String[] args) {
	Fuel f=new Fuel();
	f.petrol();
}
}
