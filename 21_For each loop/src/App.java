import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		//for-each = traversing technique to iterate through the elements in an array/collection 
		//less steps, more readable
		//less flexible
		
		//String[] animals = {"cat", "dog", "bird"};
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("rabbit");
		animals.add("pig");
		animals.add("snake");
		
		
		for(String i : animals) {
			
			System.out.println(i);
			
		}

	}

}
