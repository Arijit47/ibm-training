//Program to count vowels and consonants in given String in Java
package Sample;

import java.util.*;

public class VCString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any sentence:");
		String s = sc.nextLine();
		s = s.toLowerCase();
		int N = s.length();
		int vCount = 0, cCount = 0;
		for (int i = 0; i < N; i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				vCount++;
			}

			else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				cCount++;
			}
		}
		System.out.println("No of vowel is:" + vCount);
		System.out.println("No of consonant is:" + cCount);
	}
}
