package game;


/**
 * 
 */

/**
 * @author fran
 *
 */
public class Main {

	/**
	 * Main method of Application
	 * @param args
	 */
	public static void main(String[] args) {
		
		int option;
		System.out.println("        STAR WARS BATTLEFRAN");
		System.out.println("--------------------------------------");
		
		do {
		
			Menu.menu();
			option = Menu.chooseMenu();
			
			switch(option) {
				case 1: Singleplayer.play();
					break;
				case 2: Multiplayer.play();
					break;
				case 3:
					break;
			}
			
		}while(option != 4);
		
		
		System.out.println("BYE");
		

	}

}
