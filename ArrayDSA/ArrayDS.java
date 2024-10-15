package ArrayDSA;

public class ArrayDS {
	public int getLargest(int number[])
	{
		
		int largest_Element=Integer.MIN_VALUE;   //-infinity 
		
		for(int i=0;i<number.length;i++)
		{
			if(largest_Element<number[i])
			{
				largest_Element=number[i];
			}
		}
		return largest_Element;
		
	}
	
	public int getSmallest(int number[])
	{
		int smallest_Element=Integer.MAX_VALUE;
		for(int i=0;i<number.length;i++)
		{
			if(smallest_Element>number[i])
			{
				smallest_Element=number[i];
			}
		}
		return smallest_Element;
	}
	
	public static void main(String[] args) {
		ArrayDS ads=new ArrayDS();
		
		int number[]= {66,44,88,23,44,23};
		
		
		System.out.println("Largest element = "+ads.getLargest(number));
		System.out.println("Smallest element = "+ads.getSmallest(number));
		

	}
}
