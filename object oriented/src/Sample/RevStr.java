//Program to reverse a String in place in Java? or Program to reverse words in a given String in Java?

package Sample;

import java.util.Scanner;

public class RevStr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String s = sc.nextLine();
		int N = s.length();
		String Rev=" ";
		char ch;
		for (int i = 0; i < N ; i++) {
			ch=s.charAt(i);
			Rev=ch+Rev;
		}
		System.out.println("Reverse sentence:"+Rev);
		sc.close();
	}
}
