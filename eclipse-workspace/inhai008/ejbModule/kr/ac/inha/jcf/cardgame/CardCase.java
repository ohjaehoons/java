package kr.ac.inha.jcf.cardgame;

/*
 * Card card = new Card();
 * Card card2 = new Card();
 *  ... 52
 * Card[] cd = new Card[52];
 * 카드객체를 52개 만들어서 셋팅을 해주면 완료.
 * 서로다른 52개의 카드
 * */
public class CardCase {
	private Card[] cards;
	int numOfCards = Card.grim.length*Card.number.length;
	
	// CardCase cc = new CardCase();
	public CardCase(){
		// 초기화 , 카드를 섞는 작업
		cards = new Card[numOfCards];
		shuffle();
	}

	// 서로다른 카드를 뽑는다.
	private void shuffle() {
		int count=0;
		while (true) {
			Card cd = new Card();
			if (!isSame(cards,cd)) {
				cards[count++]=cd;
			}
			if (count==numOfCards) {
				break;
			}
		}
	}

	// "H8"라는 값이 들어간 같은 객게이면,
	// Card("H8").equals(Card("H8"))
	// 만들면 안된다. 
	private boolean isSame(Card[] cards2, Card cd) {
		boolean isT=false;
		for (int i = 0; i < cards2.length; i++) {
			if (cards2[i]!=null && cards2[i].equals(cd)) {
				isT=true;
				break;
			}
		}		
		return isT;
	}
	
	public Card[] getCards(){
		return cards;
	}
}





















