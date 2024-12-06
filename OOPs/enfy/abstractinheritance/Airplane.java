package com.enfy.abstractinheritance;

public abstract class Airplane {
		int serialno,seatingno,capacity;
		abstract int checkUniqueserialno(int serial);
		
		public Airplane()
		{
			
		}
		
		public Airplane(int serialno, int seatingno)
		{
			serialno= this.serialno;
			seatingno =  this.seatingno;
		}
		 
		
}

class B747 extends Airplane
{
	public int checkUniqueserialno(int serial)
	{
		
		return 1;
	}
	
	@Override
	public String toString() {
		return "Airplane [serialno=" + serialno + ", seatingno=" + seatingno + "capacity = "+capacity+"]";
	}

}

class B757 extends Airplane
{
	public int checkUniqueserialno(int serial)
	{
		
		return 1;
	}
	@Override
	public String toString() {
		return "Airplane [serialno=" + serialno + ", seatingno=" + seatingno + "capacity = "+capacity+"]";
	}

}

class B767 extends Airplane
{
	public int checkUniqueserialno(int serial)
	{
		
		return 1;
	}
	
	@Override
	public String toString() {
		return "Airplane [serialno=" + serialno + ", seatingno=" + seatingno + "capacity = "+capacity+"]";
	}

}

