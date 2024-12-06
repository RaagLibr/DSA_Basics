package com.enfy.interfaceex;
import java.util.*;
public class Test 
{
	public static void main(String[] args) {
		Vehicle v[] =  new Vehicle[3];			//vehicle k reference in array to store data
		Scanner sc = new Scanner(System.in);
		Bus bus =  new Bus();
		Aeroplane arp  = new Aeroplane();
		Rocket rocket= new Rocket();
		for(int i=0;i<v.length;i++)
		{
			System.out.println("Enter 1 to create a bus \nEnter 2 to create aeroplane \nEnter 3 for rocket ");
			int choise = sc.nextInt();
			if(choise==1)			//user wants to create a bus
			{
				bus.Busv(v,i);
				
			}
			else if(choise == 2)
			{
				arp.aroplaneFun(v, i);
				
				
			}
			else if(choise == 3)
			{
				
				rocket.rocketFun(v, i);
			
			}
		}
		
		int count = 0;
		for(int i=0;i<3;i++)
		{
			if(v[i] instanceof FlyingObj)
			{
				count ++;
			}
			System.out.println(v[i]);
		}
		System.out.println("Total Flying object are : "+count);
	}
}
