package com.enfy.ashishjavapg;

import java.util.HashMap;
import java.util.Map.Entry;

public class RemoSpecialCharacter {
	public static void remoSpecialChar(String s)
	{
		//String str= "This#string%contains^special*characters&.";
		s = s.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(s);
		singleSpace(s);
		
	}
	
	
	
	public static void singleSpace(String s2)
	{
		s2=s2.replaceAll(" +"," ");
		System.out.println(s2);
		remoWhiteSpaces(s2);
	}
	
	
	public static void remoWhiteSpaces(String s1)
	{
		s1=s1.replaceAll(" ","");
		System.out.println(s1);
		findNumberFromString(s1);
		
	}
	
	public static void findNumberFromString(String sn)
	{
		HashMap<Character,Integer> map=new HashMap<>();
		for(int i=0;i<sn.length();i++){
		if(map.get(sn.charAt(i))==null){
		map.put(sn.charAt(i),1);
		}
		else{
		map.put(sn.charAt(i),map.get(sn.charAt(i)) +1);
		}
		}
		for(Entry<Character,Integer> entry:map.entrySet()){
		System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
	}
	public static void main(String[] args) {
		remoSpecialChar("This#string%contains^special*characters&.Ashish is ha oops   java ");
		//singleSpace("Ashish is ha oops java ");
		
	}
}
