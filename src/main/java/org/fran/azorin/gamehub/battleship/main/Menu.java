/**
 * 
 */
package main;

import java.util.Scanner;

/**
 * @author Fran Azorin
 *
 */
public class Menu {

	public static void menu() {
		
		System.out.println("       MENU");
		System.out.println("-------------------");
		System.out.println("1. Single Player");
		System.out.println("2. Multi Player");
		System.out.println("3. Options");
		System.out.println("4. Exit Game");
	}
	
	public static int chooseMenu() {
		
		Scanner scan = new Scanner(System.in);
		int option = scan.nextInt();

		return option;
		
	}
}
