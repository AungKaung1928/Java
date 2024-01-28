
public class App {

	public static void main(String[] args) {
		
		
		String [][] cars = {{"Ertica", "Ciaz", "Swift"}, {"Landcruiser", "Crown", "Belta"}, {"Tesla", "Ford", "Toyoto"}};
		
		
		for (int i=0; i<cars.length; i++) {
			
			System.out.println();
			
			for(int j=0; j<cars[i].length; j++) {
				System.out.println(cars[i][j]+ "");
			}
			
		}

	}

}
