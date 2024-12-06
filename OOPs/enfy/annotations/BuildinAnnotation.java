package com.enfy.annotations;
import java.lang.annotation.*;

/*
 * BUILD-IN ANNOTATIONS ARE
 * 1.Retention
 * 2.Documented
 * 3.Target
 * 4.Inherited - annotation work on current or inherited next class also
 * 5.Repeated
 * 
 */

@Retention(RetentionPolicy.CLASS)
@Documented
@Target(value= {ElementType.LOCAL_VARIABLE,ElementType.METHOD}) //use the annotation on whether local or above method
//@Repeatable(Myanno1.class)
@interface Myanno1
{
	String name();
	String project();
	String date() default "today";
	
}


public class BuildinAnnotation {
	int data;
	
	public static void main(String[] args) {
		@Myanno1(name="Ajay", project="bank")

		int x;
	}
}
