package com.GreatestOf3Numbers;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	double rand1=Math.random();
    	double rand2=Math.random();
    	double rand3=Math.random();
    	
    	System.out.println("Number generated are: "+rand1+"\t"+rand2+"\t"+rand3);
    	if(rand1>rand2 && rand1>rand3)
    		System.out.println(rand1+" is greatest");
    	else if(rand2>rand1 && rand2>rand3)
    		System.out.println(rand2+ " is greatest");
    	else
    		System.out.println(rand3+" is greatest");
    }
}
