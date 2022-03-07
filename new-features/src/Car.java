
public class Car {
	private String model;
	private String[] features;
	
	//It can only be the parameter of method
	public Car(String model, String...features) {   //var-args
		this.model = model;
		this.features = features;
	}
	
	public void specs()
	{
		System.out.println("Features of " + model);
		for(String f: features)
			System.out.println(" - " + f);
	}
	
	public static void main(String[] args) {
		Car alto = new Car("Suziki Alto", "Keyless", "AC", "Power window");
		alto.specs();
		
		Car astor = new Car("MG Astor", "ABS", "Moon Roof", "Keyless");
		astor.specs();
	}
}
