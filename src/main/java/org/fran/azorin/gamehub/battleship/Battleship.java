package org.fran.azorin.gamehub.battleship;

import org.fran.azorin.gamehub.battleship.main.Menu;

import static org.fran.azorin.gamehub.battleship.main.Game.play;


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
				case 1: play();
					break;
				case 2: 
					break;
				case 3: 
					break;
			}
			
			
		}while(option != 4);



	}

}
