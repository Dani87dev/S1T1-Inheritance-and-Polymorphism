package n2exercice1;

public class Main {

	public static void main(String[] args) {

        //From Main's app, I create a new object Smartphone and call all methods
		Smartphone iphoneDani = new Smartphone("apple", "iphone");
		
		iphoneDani.call("650332211");
		iphoneDani.alarm();
		iphoneDani.photographing();
		
	}

}
