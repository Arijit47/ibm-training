//This is Generics
public class Demo<a> {
	private a data;

	public Demo(a data) {
		this.data = data;
	}

	public a getData() {
		return data;
	}

	public void setData(a data) {
		this.data = data;
	}
	
	public static void main(String[] args) {
		Demo<String> d1 = new Demo<String>("Hello");
		System.out.println(d1.getData());
		
		Demo<Integer> d2 = new Demo<Integer>(1000);
		System.out.println(d2.getData());
	}
}
