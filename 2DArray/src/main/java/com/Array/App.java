package com.Array;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Warning: Number of columns in first matrix should be equal to the number of rows in second matrix!");
    	Scanner sc=new Scanner(System.in);
    	System.out.println( "For 1st Matrix Enter How Many Rows, Columns?" );
    	int r1=sc.nextInt();
    	int c1=sc.nextInt();
    	
    	int arr1[][]=new int[r1][c1];
    	System.out.println("Enter Elements of first Matrix: ");
    	for(int i=0; i<r1; i++)
    		for(int j=0; j<c1; j++)
    			arr1[i][j]=sc.nextInt();
    	
    	System.out.println( "For 2nd Matrix Enter How Many Rows, Columns?" );
    	int r2=sc.nextInt();
    	int c2=sc.nextInt();
    	
    	int arr2[][]=new int[r2][c2];
    	System.out.println("Enter Elements of second Matrix: ");
    	for(int i=0; i<r2; i++)
    		for(int j=0; j<c2; j++)
    			arr2[i][j]=sc.nextInt();
    	
    	int arr3[][]=new int[r1][c2];
    	
    	for(int i=0; i<r1; i++) {
    		for(int j=0; j<c2; j++) {
    			arr3[i][j]=0;
    			for(int k=0; k<c2; k++) {
    				arr3[i][j]+=arr1[i][k]*arr2[k][j];
    			}
    			System.out.println("Multiplication of matrix is: ");
    			System.out.print(arr3[i][j]+" ");
    		}
    		System.out.print("\n");
    	}
    }
}
