
public class App {

	public static void main(String[] args) {
		//constructor = special method that is called when an object is instantiated(created)
		
		Human human1 = new Human("Rick", 70, 60.3);
		Human human2 = new Human("Morty ", 27, 50.2);
		
		System.out.println(human1.age);
		System.out.println("");
		System.out.println(human2.name);

		human2.eat();
		human1.drink();

	}

}
