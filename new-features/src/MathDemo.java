
@FunctionalInterface
interface Maths{
//	int square(int n);
	int sum(int a, int b);
//	boolean isOdd(int n);
}

public class MathDemo {
	public static void main(String[] args) {
//		Maths m1 = (n) -> n*n;
//		
//		Maths m2 = (int n) ->{
//			int sqr = n*n;
//			return sqr;
//		};
//		System.out.println(m1.square(10));
//		System.out.println(m2.square(5));
		
//		Maths o1 = (n) -> n % 2!=0 ? true : false;
//		
//		Maths o2 =(int n) ->{
//			if(n%2!=0)
//				return true;
//			else
//				return false;
//		};
//		System.out.println(o1.isOdd(2));
//		System.out.println(o1.isOdd(3));
//		System.out.println(o2.isOdd(2));
//		System.out.println(o1.isOdd(3));
		
		Maths s1 = (a,b) -> a+b;
		
		Maths s2 = (int a,int b) ->{
			int y = a+b;
			return y;
		};
		System.out.println(s1.sum(10, 20));
		System.out.println(s2.sum(20, 30));
	}
}
