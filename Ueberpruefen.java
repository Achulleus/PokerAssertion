package pokerAssertions;

public class Ueberpruefen {
	
	static int scan;
	static int [] cards = new int [52];
	static int [] hand = new int [5];
	static boolean status = false;
	
	public static void main(String[] args) {
		fillCards(cards);
		fillHand1();
		fillHand2();		
		checkOnePare();
		assert status: "Es handelt sich um kein Paar!";
		System.out.println("Es handelt sich um ein Paar!");
	}
	
		static public void fillCards(int cards[]) {
			for(int i = 0; i < cards.length; i++) {
				cards[i] = i;
			}
		}
		
		static public void fillHand1(){
			hand[0] = 1;
			hand[1] = 13;
			hand[2] = 16;
			hand[3] = 15;
			hand[4] = 14;
		}
		
		static public void fillHand2(){
			hand[0] = 1;
			hand[1] = 30;
			hand[2] = 30;
			hand[3] = 30;
			hand[4] = 30;
		}
		
		static public void checkOnePare() {
			for(int i = 0; i < hand.length-1; i++) {
				for(int j = 1; j < hand.length; j++) {
					if (i+j <= 4) {
						if((hand[i] - hand[i+j]) % (cards.length/4) == 0) status = true;
					}
				}
			}
		}
}
