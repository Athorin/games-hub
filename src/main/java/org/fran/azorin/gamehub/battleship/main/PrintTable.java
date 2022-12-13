package org.fran.azorin.gamehub.battleship.main;

/**
 * @author Fran Azorin
 *
 */
public class PrintTable {

	public static void printTable(String[][] table) {
		
		System.out.println("                  ZONA DE BATALLA\n");
		for(int i = 0; i < 10; i++) {
			
			System.out.print("["+i+"]");
			if(i == 0) System.out.print(" "); //Lo uso para ajustar el texto de la primera linea
			
			for(int j = 1; j < 10; j++) {
				
				if(i == 0) System.out.print(" | " + "["+j+"]");
				else System.out.print("  |  " +table[i][j]);
			}

			System.out.println("\n----------------------------------------------------------");
		}
	}
}
