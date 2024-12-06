package com.efny.constructorcopy;

class Constructor1
{
	String name;
	int roll;
	String pass;
	int marks[];
	
	
	
	//copy constructor
//shallow copy constructor - we can set differenct data for both objects.
//data simply refers to the same array as vals.
//This can lead to unpleasant side effects
//if the elements of values are changed via some other reference.	
	
//	public Constructor1(Constructor1 ct) {
//			 marks = new int[3];
//			this.name=name;
//			this.pass=pass;
//			this.marks=ct.marks;
//			
//		}

	
	//deep copy constructor.
	//data won't change in both object
		public Constructor1(Constructor1 ct) {
				 marks = new int[3];
				
				for(int i=0;i<marks.length;i++)
				{
					this.marks[i]=ct.marks[i];
					
				}
				
			}

/*
 * If only primitive type fields or Immutable objects are there
 *  then there is no difference between shallow and deep copy in Java.
 * 	
 */
		
		
		
/*
 * if an object has only primitive fields, 
 * then obviously we should go for shallow copy, but if the object has 
 * references to other objects, then based on the requirement, 
 * shallow copy or deep copy should be done. If the references 
 * are not updated then there is no point to initiate a deep copy.		
 */
	public Constructor1(String pass) {
		super();
		 marks = new int[3];
			
		this.pass = pass;
	}

	
//	
//
//	@Override
//	public String toString() {
//		return "Constructor1 [name=" + name + ", roll=" + roll + ", pass=" + pass + "]";
//	}


	
	
	public Constructor1(String name, int roll,String pass) {
		super();
		marks = new int[3];
		this.name = name;
		this.roll = roll;
		this.pass=pass;
	}

	
	Constructor1()
	{
		 marks = new int[3];
		System.out.println("inside constructor.");
	}
}



public class ConstructorShallow 
{
	public static void main(String[] args) 
	{
		Constructor1 ct= new Constructor1();
		ct.name="raag";
		ct.pass="rag";
		System.out.println("old pass : " +ct.pass);
		ct.marks[0]=99;
		ct.marks[1]=100;
		ct.marks[2]=55;
		
		Constructor1 ctp3= new Constructor1(ct); //copy
		ctp3.pass="rag3";
		ctp3.marks[0]=69;
		
		System.out.println("old passwrod ct coppied in ctp3\n = "+ctp3.pass);
		
		for(int i=0;i<3;i++)
		{
		//ct k marks gonna print over here , coz we copied it into ctp3
			System.out.println("old marks = "+ct.marks[i]);
			System.out.println("new marks = "+ctp3.marks[i]);
		} 
	}
}
