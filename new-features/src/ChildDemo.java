
public class ChildDemo<a, c> extends Demo<a> {

	private c temp;

	public ChildDemo(a data, c temp) {
		super(data);
		this.temp = temp;
	}

	public c getTemp() {
		return temp;
	}

	public void setTemp(c temp) {
		this.temp = temp;
	}

	public static void main(String[] args) {
		ChildDemo<String, Integer> c1 = new ChildDemo<String, Integer>("polo", 21);
		System.out.println(c1.getData() + "\t" + c1.getTemp());
	}
}
