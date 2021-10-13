class Tester
{
public static void main(String[] madhu)
{
Car car=new Car();
Vehicle vehicle=new Vehicle();
//vehicle.toTravel();
//vehicle.getCompany();
//Upcasting
AutoMobile autoMobile=new Gears();
//autoMobile.getCompany();
//Downcasting
Gears gears=(Gears)autoMobile;
gears.getCompany();
gears.provideSafty();
}

}