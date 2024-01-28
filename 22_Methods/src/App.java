
public class App {

	public static void main(String[] args) {
		
		//method = a block of code that is executed whenever it is called upon 
//		String name ="allkg";
//		int age = 27;
//		hello(name, age);
		int x = 3;
		int y =-10;
		
		System.out.println(add(x,y));

	}
	
//	static void hello(String result, int age ) {
//		//it is okay if the parameters in main methods and argument do not match)
//		System.out.println("Hey "+ result);
//		System.out.println("You are "+ age+".");
	
		static int add(int x, int y) {
			
			return x+y;  //you must return a value if you didn't declare void.
		}
//	}

}
