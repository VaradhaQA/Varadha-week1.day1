package week1.day1;

public class Car 
{
	public void applyBreak() 
	{System.out.println("Apply Break");}
	public void applyGear() 
	{System.out.println("Apply Gear");}
	public void switchonAc() 
	{System.out.println("switchonAc");}
	public void applyAcclerate() 
	{System.out.println("Apply Acclerate");}
	
public static void main(String[] args) 
{
	Car myBreak = new Car();
	myBreak.applyBreak();
	Car myGear = new Car();
	myGear.applyGear();
	Car myswitchonAc = new Car();
	myswitchonAc.switchonAc();
	Car myapplyAcclerate = new Car();
	myapplyAcclerate.applyAcclerate();
	}
	}






