package com.HarmonicSeries;

import java.util.Scanner;

    public class App 
    {
        public static void main( String[] args )
        {
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Enter Harmonic Order:");
        	int n=sc.nextInt();
        	double series = 0;
        	System.out.println(n+" order Harmonic Series is: "+ series);
        	while(n>0) {
        		series= series+ (double)1/n;
        		n--;
        	System.out.print(series+" ,");
        }
    }
}