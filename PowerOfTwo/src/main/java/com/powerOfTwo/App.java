package com.powerOfTwo;

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
    	System.out.println("How Many Events?");
    	int n=sc.nextInt();
    	
    	int count=0;
    	int headCount=0;
    	int tailCount=0;
    	
    	for(int i=0; i<n; i++) {
    		double rand=Math.random();	
    	if( rand>0.5) {
        System.out.println("Head Wins");
    	headCount++;
    	}
    	else {
    	System.out.println("Tail Wins");
    	tailCount++;
    	}
    	count++;
    	}
    	System.out.println("Total Counts Are: "+count);
    double HeadPercent=(double)headCount/count*100;
    System.out.println("Heads Winning Percentage: "+ HeadPercent);
    double TailPercent=(double)tailCount/count*100;
    System.out.println("Tails Winning Percentage: "+TailPercent);
    }
}