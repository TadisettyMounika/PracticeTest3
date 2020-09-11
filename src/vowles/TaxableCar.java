package vowles;

import java.util.Scanner;

class Vehicle {
	public static int mostOften(int arr[],int n)
	{
		return n;
		
	}
	public static void main(String args[])
	{
		System.out.println("The Array List");
		Scanner sc=new Scanner(System.in);
		 
		int arr[]= {10,20,30,40,50}; 
         int n = arr.length; 
        int m=mostOften(arr,n);
        for(int i=0;i<n;i++) {
        	System.out.println(arr[i]);
        }
        System.out.println("Size of the Array "+m);
   
	}
}
