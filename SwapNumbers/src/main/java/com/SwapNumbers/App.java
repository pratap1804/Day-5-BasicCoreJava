package com.SwapNumbers;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
class numbers{
	int x,y;
	numbers(int x, int y){
		this.x=x;
		this.y=y;
	}
}
class swapNumbers{
	void swap(numbers obj) {
		int temp;
		temp=obj.x;
		obj.x=obj.y;
		obj.y=temp;
	}
}

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter first number, second number");
    	int x=sc.nextInt();
    	int y= sc.nextInt();
        System.out.println( "Numbers Entered are: "+x+"\t"+y );
        numbers obj1 = new numbers (x, y);
        swapNumbers obj2 = new swapNumbers();
        obj2.swap(obj1);
        System.out.println("Swapped Numbers are: "+obj1.x+"\t"+obj1.y);
    }
}
