
public class App {

	public static void main(String[] args) {
		
//		Food[] refrigerator = new Food [3];
		
//		Food [] eatingList = new Food [4];
		
		Food	list1 = new Food ("Breakfast");
		Food	list2 = new Food ("Lunch");
		Food	list3 = new Food ("Brunch");
		Food	list4 = new Food ("Dinner");
		
		Food [] eatingList = {list1,list2,list3};
//		eatingList[0] = list1 ;
//		eatingList[1] = list2 ;
//		eatingList[2] = list3 ;
//		eatingList[3] = list4 ;
		
		System.out.println(eatingList[0].list);

	}
	
	
	

}
