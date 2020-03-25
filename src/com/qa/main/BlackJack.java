package com.qa.main;

public class BlackJack {

	public int play(int Number1, int Number2) {
		if (Number1 > 21 && Number2 > 21) {
			return 0;
		}
		else if (Number2 > 21) {
			return Number1;
		}
		else if (Number1 > Number2) {
			return Number1;
		}
		else {
			return Number2;
		}

	}

}
