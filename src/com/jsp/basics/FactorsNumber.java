package com.jsp.basics;
import java.util.Scanner;

public class FactorsNumber {

	public static void factors(int n) {
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(i + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int n = sc.nextInt();
		factors(n);
		sc.close();
	}

}
