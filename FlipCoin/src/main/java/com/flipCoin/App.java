package com.flipCoin;

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
			System.out.println("Enter a number from 0 to 31");
				int n=sc.nextInt();
				double res = Math.pow(2,n);
					System.out.println(res);
				
    }
}
