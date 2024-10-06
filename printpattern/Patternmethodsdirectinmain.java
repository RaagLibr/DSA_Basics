package com.enfy.printpattern;
public class Patternmethodsdirectinmain 
{

    public static void hollowPatter(int totRows, int totCols)
    {
        //outer loop
        for(int i=1;i<=totRows;i++)
        {
            //inner -column
            for(int j=1;j<=totCols;j++)
            {
                //cell - (i,j)
                if(i==1||i==totRows||j==1||j==totCols)
                {
                    System.out.print("*"+" ");
                }
                else
                {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();

          }

        }

        public static void Inverted_roted_half_Pyramid(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++)
                {
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
          }

          public static void PrintCharacter(int n)
          {
            
            char ch='A';
            for(int line=1;line<=n;line++)
                {
                    for(int chars=1;chars<=line;chars++)
                    {
                        System.out.print(ch+" ");
                        ch++;
                    }
                    System.out.println();
                }
        }


public static void butterfly(int n)
{
    //Outer loop first half
    for(int i=1;i<=n;i++)
    {
        //star-i
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        //space-2*(n-i)
        for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
        //stars-i
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    
    }

    //Outer loop first half
    for(int i=n;i>=1;i--)
    {
                //star-i
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        //space-2*(n-i)
        for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
        //stars-i
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();

    }
}



public static void solidRhombus(int n)
{
    //outer loop
    for(int i=1;i<=n;i++)
    {
        //space
        for(int j=1;j<=(n-i);j++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=n;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
}


 public static void hollow_rhombus(int n)
 {
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        
        }
        //hollow_rectangle stars
        for(int j=1;j<=n;j++)
        {
        if(i==1||i==n||j==1||j==n)
        {
            System.out.print("* ");
        }
        else
        {
            System.out.print("  ");
        }
         }
    System.out.println();
}
 }
 

 

 public static void numPyramid(int n)
 {
        for(int i=1;i<=5;i++)
        {
            //blank space before pyramid
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(' ');
            }

            //pyramid line
            for(int j=1;j<=i;j++)
            {
                
                System.out.print(i);
                if(j!=i)
                {
                    System.out.print(" ");
                }
            }
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void reverseDigit(int n)
    {
        int ld,rev=0;
        while(n>0)
        {
            ld=n%10;
            rev=(rev*10)+ld;
            n=n/10;
        }
        System.out.println(rev);
    }
 

      public static void main(String args[])
            {
                hollowPatter(10, 7);
               //Inverted_roted_half_Pyramid(20);
              //PrintCharacter(5);
             // butterfly(7);
            // solidRhombus(5);
             //hollow_rhombus(5);
              //  numPyramid(5);
              //reverseDigit(54323);
            }
        


}