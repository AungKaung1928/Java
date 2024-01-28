
public class App {

	public static void main(String[] args) {
		
		//object = an instance of a class that may contain "attributes" and "methods"
		// example: (ph, laptop, computer, ice cream)
		
		Car myCar1 = new Car();
		Car myCar2 = new Car();
		
		System.out.println(myCar1.year);
		System.out.println("");
		System.out.println(myCar1.color);
		System.out.println("");
		
		System.out.println(myCar2.model);
		System.out.println("");
		System.out.println(myCar2.price);
		System.out.println("");


		myCar1.brake();
		myCar2.drive();
	}

}
