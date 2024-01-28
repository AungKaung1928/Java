import java.util.Random;

public class DiceRoller {

	//local
//	
//	DiceRoller(){
//		
//		Random random = new Random();
//		int number = 0;
//		roll (random, number);
//	}
//	
//	void roll(Random random, int number) {
//		number = random.nextInt(100)+1;
//		System.out.println(number);
//		
//	}
	
	//global
	
	Random random;
	int number;
	
	DiceRoller(){
		random = new Random();
		roll();
	}
	
	void roll() {
		number = random.nextInt(100)+1;
		System.out.println(number);
	}
	
	
}
