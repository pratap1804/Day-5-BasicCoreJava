package com.QuotientRemainder;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println( "Enter Divident:");
    	int x=sc.nextInt();
    	System.out.println("Enter Divisor");
    	int y=sc.nextInt();
    	int quotient=x/y;
    	System.out.println("Quotient is: "+quotient);
    	int remainder=x%y;
    	System.out.println("Remainder is: "+remainder);
    }
}
