package com.EvenOddNumbers;

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
    	System.out.println("Enter Number:");
    	double n=sc.nextDouble();
    	if(n % 2 ==0)
        System.out.println( n+" is a even number" );
    	else
    	System.out.println(n+" is a odd number");
    }
}
