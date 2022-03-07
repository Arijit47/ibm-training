//Program to reverse a String in place in Java? or Program to reverse words in a given String in Java?
package Sample;

import java.util.Scanner;

public class RevStr2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String s = sc.nextLine();
		int N = s.length();
		char[] ch=s.toCharArray();
		System.out.println("Reverse sentence:");
		for (int i = N-1; i >= 0; i--) {
		System.out.print(ch[i]);
		}
		sc.close();
	}
}
