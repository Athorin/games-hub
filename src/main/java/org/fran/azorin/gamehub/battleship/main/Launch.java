/**
 * 
 */
package main;

import table.Table;

/**
 * @author Fran Azorin
 *
 */
public class Launch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("                    BATTLESHIP");
		System.out.println("----------------------------------------------------------");
		
		int option;
		
		do {
			Menu.menu();
			option = Menu.chooseMenu();
			
			switch(option) {
				case 1: Game.play();
					break;
				case 2: 
					break;
				case 3: 
					break;
			}
			
			
		}while(option != 4);



	}

}
