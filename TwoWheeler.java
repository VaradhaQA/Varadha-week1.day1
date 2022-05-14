package week1.day1;

public class TwoWheeler 
{
	int noOfWheels = 4;
	short noOfMirrors = 2;
	long chassisNumber = 12345678L;
	boolean isPunctured = false;
	String bikeName = "TVS";
	double runningKM = 1234.56;

public void myBike () {
	System.out.println(noOfWheels);
	System.out.println(noOfMirrors);
	System.out.println(chassisNumber);
	System.out.println(isPunctured);
	System.out.println(bikeName);
	System.out.println(runningKM);
}
public static void main(String[] args) 
{
TwoWheeler bike = new TwoWheeler();
bike.myBike();
}}


