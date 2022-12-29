package org.fran.azorin.gamehub.games.megamind;

import org.fran.azorin.gamehub.games.megamind.game.Menu;

/**
 * @author Fran Azorin
 *
 */
public class Megamind {

	public static void launch() {
		
		int option;
		
		do {
			option = Menu.execute();
		} while(option != 0);
	}


}
