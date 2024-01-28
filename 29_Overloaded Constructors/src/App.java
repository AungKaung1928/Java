import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		// overloaded constructors = multiple constructors within a class with the same name, 
		//							 but have different parameters 
		//							 name + parameters = signature
		
		Pizza pizza = new Pizza("thic crust", "tomato", "mozerella", "pepperoni");
		System.out.println("Here are the ingredients of your pizza");
		System.out.println(pizza.bread);
		System.out.println(pizza.cheese);
		System.out.println(pizza.sauce);
		System.out.println(pizza.topping);
		
		Scanner scanner = new Scanner(System.in);
		
		int num1;
		int num2;
		int number;
		
		int number = num1+num2;
		
		System.out.println("Enter 1st number");
		integer num1 = scanner.nextInt();
		
		System.out.println("Enter 1st number");
		integer num2 = scanner.nextInt();
		
		System.out.println("The result is : " + number);

	}

}
