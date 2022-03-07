//Reverse an array.
package Sample;

import java.util.Arrays;

public class RevArr {

	public static void main(String[] args) {
		int []a= {21,54,5,4,56,78,64};

		int N=a.length;
		System.out.println(Arrays.toString(a));
		for(int i=0; i<=N/2; i++) {
			int first=a[i];
			int last=a[N-1-i];
			
			a[i]=last;
			a[N-1-i]=first;
		}
		System.out.println(Arrays.toString(a));
	}

}
