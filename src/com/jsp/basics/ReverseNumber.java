package com.jsp.basics;

public class ReverseNumber {

	public static void main(String[] args) {
		int n = 1234;
		int temp = n;
		int rev = 0;
		
		while(n>0) {
			rev = n % 10+rev * 10;
			n= n/10;
		}
		
		
		
		
		if(temp==rev) {
			System.out.println("Palin");
		}
		else {
			System.out.println("Not Palin");
		}
		System.out.println(rev);
		
	}

}
