package com;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		String s;
		int i,l;
		boolean flag=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");
		s=sc.nextLine();
		l=s.length()-1;
		
		for(i=0;i<l;i++,l--) {
			if(s.charAt(i)!=s.charAt(l)) {
				System.out.println(s+" is not palindrome");
				flag=false;
				break;
			}
		}
		
		if(flag==true) {
			System.out.println(s+" is palindrome");
		}
	}

}
