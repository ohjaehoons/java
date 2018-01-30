package kr.ac.inha.jcf.cardgame;

public class CardGame {
	public static void main(String[] args) {
//		Card card = new Card();
//		System.out.println(card.getCard());
		CardCase cardCase = new CardCase();// 셋팅!!!
		Card[] cd = cardCase.getCards();
		for (int i = 0; i < cd.length; i++) {
			System.out.print("["+cd[i].getCard()+"]");
			if ((i+1)%13==0) {
				System.out.println();				
			}
		}
	}
}
