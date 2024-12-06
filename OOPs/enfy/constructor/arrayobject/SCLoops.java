package com.enfy.constructor.arrayobject;


public class SCLoops {

    public static void main(String[] args) 
    {
        Subject subs[]=new Subject[3];
        subs[0]=new Subject("s101","DS",100);
        subs[1]=new Subject("s102","Algorithms",100);
        subs[2]=new Subject("s103","Operating Systems",100);
        
        for(Subject s:subs)
            System.out.println(s);
    }
    
}