package kr.ac.inha.jcf.cardgame.jcf;

import java.util.ArrayList;

public class CardGame {
	public static void main(String[] args) {
		CardCase cardCase = new CardCase();// 셋팅!!!
		ArrayList cd = cardCase.getCards();
		for (int i = 0; i < cd.size(); i++) {
			System.out.print("["+((Card)cd.get(i)).getCard()+"]");
			if ((i+1)%13==0) {
				System.out.println();				
			}
		}
	}
}
