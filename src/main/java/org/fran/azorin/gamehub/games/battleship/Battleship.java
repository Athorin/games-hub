package org.fran.azorin.gamehub.games.battleship;

import org.fran.azorin.gamehub.games.battleship.main.Game;
import org.fran.azorin.gamehub.games.duelcards.game.Menu;


/**
 * @author Fran Azorin
 *
 */
public class Battleship {

	/**
	 * Launch battleship game
	 */
	public static void launch() {

		System.out.println("                    BATTLESHIP");
		System.out.println("----------------------------------------------------------");
		
		int option;
		
		do {
			Menu.menu();
			option = Menu.chooseMenu();
			
			switch(option) {
				case 1: Game.play(); break;
				case 2:  break;
				case 3:  break;
			}
		} while(option != 4);

	}


}
