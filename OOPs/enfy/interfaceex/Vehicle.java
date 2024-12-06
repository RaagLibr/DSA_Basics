package com.enfy.interfaceex;

import java.util.Scanner;

public class Vehicle
 {
	int noseats;
	String fuel;
	int speed;
	
	public Vehicle()
	{
		
	}
	public Vehicle(int noseats, String fuel, int speed) 
	{
		super();
		this.noseats = noseats;
		this.fuel = fuel;
		this.speed = speed;
	}
	
//	@Override
//	public String toString() {
//		return "\nVehicle \nnoseats=" + noseats + "\nfuel=" + fuel + "\nspeed=" + speed ;
//	}
	Scanner sc = new Scanner(System.in);
	
}

interface FlyingObj
{
	 int maxheight=20000;    //constant values
}

class Aeroplane extends Vehicle implements FlyingObj
{
	int takeoffspeed;
	private int i;
	
	
	public Aeroplane()
	{
		
	}
	public Aeroplane(int noseats,String fuel,int speed, int takeoffspeed)
	 {
		super(noseats, fuel, speed);
		this.takeoffspeed=takeoffspeed;
	}
	public String toString()
	{
		//return "No. seats = "+noseats+"\nfuel = "+fuel+"\nspeed = "+speed+"\ntakeoffspeed = "+takeoffspeed;
		String aeroPrint;
		aeroPrint =  "\nAttribute of Aeroplane ";
		aeroPrint= aeroPrint+"\nno of seats : "+noseats+"\nfuel = "+fuel+"\nspeed = "+speed+"\ntake off speed = "+takeoffspeed;		
		aeroPrint = aeroPrint+ "\nMaximum height : "+maxheight;
		aeroPrint=aeroPrint+"\nTake of Speed : "+takeoffspeed ;
		return aeroPrint;
	}
	
	public void aroplaneFun(Vehicle[] v, int i) {
		// TODO Auto-generated method stub
		int seats;
		String fuel;
		int speed;
		int takeoffspeed;
		System.out.println("Enter values for aeroplane = ");
		System.out.println("seats = ");
		 seats=sc.nextInt();
		 System.out.println("fuel = ");
		fuel=sc.next();
		System.out.println("speed = ");
		speed=sc.nextInt();
		System.out.println("take of speed = ");
		takeoffspeed=sc.nextInt();
		v[i]=new Aeroplane(seats,fuel,speed,takeoffspeed);			//parent k reference me child ka obj
	
	}
	
	
}

class Rocket extends Vehicle implements FlyingObj
{
	String rockettype;
	@Override
	public String toString() {
		String rocket;
		rocket=  "\nAttribute of Rocket ";
		rocket= rocket+"\nno of seats : "+noseats+"\nfuel = "+fuel+"\nspeed = "+speed;		
		return rocket;
	
	}
	public Rocket()
	{
		
	}
	public Rocket(int noseats,String fuel, int speed)
	{
		super(noseats,fuel,speed);
			
	}
	
	public void rocketFun(Vehicle v[],int i)
	{
		int noseats;
		String fuel;
		int speed;
		System.out.println("Enter values for rocket = ");
		noseats=4;
		System.out.println("fuel = ");
		fuel=sc.next();
		System.out.println("speed = ");
		speed=sc.nextInt();
		v[i]=new Rocket(noseats,fuel,speed);  //adding parameters in array,//parent k reference me child ka obj
	
	}
}
	
class Bus extends Vehicle
{
	String bustype;
	private Bus[] v;
	private int i;
	
	public Bus()
	{
		
	}
	public Bus(int noseats,String fuel, int speed , String type )
	{
		super(noseats,fuel,speed);
		this.bustype=type;
	}
	public String toString()
	{ 
		String BusPrint = "\nAttribute of Bus";
		BusPrint = BusPrint+"\nno seats = "+noseats+"\nfuel = "+fuel+"\nspeed = "+speed+"\nspeed = "+speed;
		BusPrint = BusPrint+"\ntype = "+bustype;
		return BusPrint;
	}
	
	public void Busv(Vehicle[] v, int i)
	{
			int seats;
			String fuel;
			int speed;
			String type;
			System.out.println("Enter values for bus = ");
			System.out.print("seats = ");
			 seats=sc.nextInt();
			 System.out.print("fuel = ");
			fuel=sc.next();
			System.out.print("speed = ");
			speed=sc.nextInt();
			System.out.print("type = ");
			type=sc.next();
		v[i]=new Bus(seats,fuel,speed,type);   		//parent k reference me child ka obj

	}
} 



