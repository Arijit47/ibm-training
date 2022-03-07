//Program to remove duplicate characters from String in Java
package Sample;

import java.util.Scanner;

public class DuplicateChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String s = sc.nextLine();
		int N = s.length();
		String s2="";
		int i;
		for (i = 0; i < N; i++) {
			char ch=s.charAt(i);
			if (s2.indexOf(ch)<0) {
				s2+=ch;
			}
		}
		System.out.println("After removing duplicate character:"+s2);
	}
}
