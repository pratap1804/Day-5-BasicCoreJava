package com.VowelsAndConsonants;

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
        System.out.println( "Enter an alphabet: ");
        String ch=sc.next();
        char arr[]= {'a','e','i','o','u'};
        if(ch.equals(arr))
        	System.out.println(ch+" is a vowel");
        	else
        		System.out.println(ch+" is a consonant");
        }
    }
