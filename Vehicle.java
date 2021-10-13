class Vehicle extends AutoMobile{
String name;
String type;
byte noOfWheels;
float price;
Vehicle()
{
	super("vehicle");
	System.out.println("Invoking Vehicle class Constructor");
	
}
void toTravel()
{
System.out.println("used to Travel");
}
@Override
void getCompany()
{
System.out.println("TATA M,FORD,BENS,LAMBORGINI");
}
}