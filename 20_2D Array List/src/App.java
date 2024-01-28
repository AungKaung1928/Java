import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		
		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("Pasta");
		bakeryList.add("Pizza");
		bakeryList.add("Sushi");
		
		ArrayList<String> produceList = new ArrayList();
		bakeryList.add("tomato");
		bakeryList.add("zucchini");
		bakeryList.add("peppers");
		
		ArrayList<String> drinkList = new ArrayList();
		bakeryList.add("coffee");
		bakeryList.add("tea");
		bakeryList.add("soda");
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinkList);
		
		System.out.println(groceryList.get(0).get(5));

	}

}
