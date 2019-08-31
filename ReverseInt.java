package com.Java.Aptiprograms.Bava;

public class ReverseInt {
	public static void main(String[] args) {
		int result=ReverseInt.RevInteger(100003);
		System.out.println(result);
		
	}
	static int RevInteger(int i) {
		int rev=0;
		while(i>0) {
			 int r=i%10;
			 rev=rev*10+r;
			i=i/10;
			
		}
		return rev;
	}

}
