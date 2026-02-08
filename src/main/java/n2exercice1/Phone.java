package n2exercice1;

public class Phone {

	private String brand;
	private String model;
	

	public Phone(String marca, String model) {
		this.brand = marca;
		this.model = model;
	}
	

	public void call(String numTel) {
		System.out.println("The number " + numTel + " is being called");
	}
}
