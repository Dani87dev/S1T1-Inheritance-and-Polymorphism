package n2exercice1;

public class Smartphone extends Phone implements Camera, Clock {
	
	public Smartphone(String brand, String model) {
		super(brand, model);
	}
	
	public void photographing() {
		System.out.println("It's taking a photo");
	}

    @Override
	public void alarm() {
		System.out.println("The alarm is ringing");
	}
}
