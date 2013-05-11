package hard;

public class ShuffleCards {

	void shuffle(String[] cards) {
		for (int i=0; i<52; i++) 
			swap(cards[i], cards[random(i)]);
	}
	
	int random(int i) {
		return (int)(Math.random()*i);
	}
	
	void swap (String a, String b) {
		String temp = a; 
		a = b;
		b = temp;
	}
}
