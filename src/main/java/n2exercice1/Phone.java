package n2exercice1;

public class Phone {

	private String brand;
	private String model;
	
	//Constructor
	public Phone(String marca, String model) {
		this.brand = marca;
		this.model = model;
	}
	
	//Getters && Setters
	public String getMarca() {
		return brand;
	}
	public String getModel() {
		return model;
	}
	public void setMarca(String marca) {
		this.brand = marca;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	//Métodes
	public void call(String numTel) {
		System.out.println("The number " + numTel + " is being called");
	}
}
