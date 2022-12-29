package org.fran.azorin.gamehub.games.duelcards.game;

import static org.fran.azorin.gamehub.utils.GameUtils.chooseOption;

/**
 * @author Fran Azorin
 *
 */
public class Menu {

	public static void duelCardsMenu(){
		int option;

		do {
			menu();
			option = chooseMenu();

			switch(option) {
				case 1: Singleplayer.play();
					break;
				case 2: Multiplayer.play();
					break;
				case 3:
					break;
			}

		} while(option != 4);
	}

	public static void menu() {
		
		System.out.println("       MENU");
		System.out.println("-------------------");
		System.out.println("1. Single Player");
		System.out.println("2. Multi Player");
		System.out.println("3. Options");
		System.out.println("4. Exit Game");
	}
	
	public static int chooseMenu() {
		return chooseOption();
	}
	

	

}
