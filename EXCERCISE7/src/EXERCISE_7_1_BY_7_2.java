class SutdaDeck {
	final int CARD_NUM = 20; // final은 const와 달리 선언시 초기화 하지 않아도됨
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck() { // 7-1번 SutdaCard배열 초기화
		for (int i = 0; i < CARD_NUM; i++) {
			if (i < 10 && ((i + 1) == 1 || (i + 1) == 3 || (i + 1) == 8))
				cards[i] = new SutdaCard(i + 1, true);
			else
				cards[i] = new SutdaCard((i % 10) + 1, false);
		}
	}

	// 7-2번 shuffle, select_pick, random_pick 함수 구현
	public void shuffle() {
		SutdaDeck temp = new SutdaDeck();
		boolean[] flag = new boolean[20];
		
		for (int i = 0; i < CARD_NUM;) {

			int index = (int) (Math.random() * 20);
			if (flag[index] == false) {
				temp.cards[i] = this.cards[index];
				flag[index] = true;
				i++;
			}
		}
		for (int i = 0; i < CARD_NUM; i++)
			this.cards[i] = temp.cards[i];
	}
	SutdaCard pick(int index) {
		return this.cards[index];
	}
	SutdaCard pick() {
		return this.cards[(int)(Math.random()*20)];
	}
}

class SutdaCard {
	int num;
	boolean isKwang;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	public String toString() {
		return num + (isKwang ? "K" : "");
	}

}

public class EXERCISE_7_1_BY_7_2 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i=0; i<deck.cards.length;i++)
			System.out.print(deck.cards[i]+",");
		
		System.out.println();
		System.out.println(deck.pick(0));

	}
}