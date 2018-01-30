package kr.ac.inha.jcf.cardgame;

/*
 * 카드 게임을 만들어 보자.
 * Card card = new Card();
 * Card[] card = new Card[52]
 * grim : H, S, D, C
 * number : A,2,3,4,5,6,7,8,9,T,J,Q,K  
 * */
public class Card {
	// 실제로 카드가 조합이 되어서 붙는 것 "H8"
	private String card;
	
	public static String[] grim={"H", "S", "D", "C"};
	public static String[] number
		={"A","2","3","4","5","6","7","8","9","T","J","Q","K"};
	
	// Card card = new Card();
	// 카드가 하나 생성이 되어야 하죠? - "H8"
	public Card(){
		init();
	}

	private void init() {
		// 0-3
		int g = (int)(Math.random()*grim.length);// 그림의 인덱스를 임의로 추출
		// 0-12
		int n = (int)(Math.random()*number.length);// 숫자의 인덱스를 임의로 추출
		// H8
		card = grim[g]+number[n];
	}
	
	// equals 오버 라이딩
	// 객쳉안에 있는 String값이 값으면 같은객체라고 해주기 위해서
	// 만들어어주는 메소드
	// equals오버라이딩을 할때 hashCode도 오버라이딩을 해줘야한다.
	@Override
	public boolean equals(Object obj) {
		boolean isT = false;
		Card cd = (Card) obj;
		if (card.equals(cd.getCard())) {
			isT=true;
		}
		return isT;
	}
	
	// 해쉬코드에 솟수를 더한다.
	// 솟수는 1과 자기자신으로 나누어떨어지는 수
	@Override
	public int hashCode() {
		return super.hashCode()+13;
	}

	public String getCard(){
		return card;
	}
}































