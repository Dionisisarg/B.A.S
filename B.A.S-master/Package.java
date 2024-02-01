import Java.io.*;
import Java.util.Scanner;
import Java.util.*;

public class Package
{
	private int id;
	private double weight;
	private Destination[] destination;
	private boolean homeDelivery;
	private String[] receiverDdetails;
	private boolean breakable;
	
	public Package (int id, double weight, boolean homeDeliver, boolean breakable)
	{
		this.id=id;
		this.weight=weight;
		this.homeDelivery=homeDelivery;
		this.breakable=breakable;
	}
	
	public void dataEntry(){
		Scanner myObj=new Scanner(System.in);
		System.out.println("Enter the id");
		Int id=myObj.nextInt();
		
		Scanner myObj1= new Scanner(System.in);
		System.out.println("Enter the weight");
		double weight=myObj1.nextDouble();
		
		Scanner myObj2=new Scanner(System.in);
		System.out.println("Is homeDelivery?");
		Boolean homeDelivery=myObj2.nextBoolean();
		
		Scanner myObj3=new Scanner(System.in);
		System.out.println("Is breakable?");
		Boolean breakable=myObj3.nextBoolean();
	}
}