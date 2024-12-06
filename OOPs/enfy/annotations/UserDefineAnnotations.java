package com.enfy.annotations;
import java.lang.annotation.Annotation;


//can't use or throws any exceptions 
@interface Myanno
{
	String name();
	String project();
	String date();
	String version() default "13";		
	
}

@Myanno(name="Ajay",project="bank",date="5august",version="version")    //@anotation-name(meta data)
public class UserDefineAnnotations {
	//@Myanno(name="Ajay")
	int data;
	
	@Myanno(name="Ajay",project="bank",date="5august")   //can give to method
	//public static void main(@Myanno(name="Ajay") String args[])   //can give to inside method for local variables
	
	public static void main(String args[])
	
	{
		//@Myanno(name="Ajay")   can give to instance variable
		int x;
		
	}
}
