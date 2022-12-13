/**
 * 
 */
package game;

import java.util.Scanner;

import character.Team;

/**
 * @author Fran Azorin
 *
 */
public class Teams {

	public Team createTeam() {
		
		Scanner scan = new Scanner(System.in);
		
		
		//REHACER
		//1º ELEGIMOS EQUIPO, SE CREARA UN OBJETO DE ESE EQUIPO
		//2º AÑADIREMOS PJS DE ESE TIPO DE EQUIPO HASTA AÑADIR 3
		
		//Adding 6 Characters (3 Empire, 3 Rebels)
		for(int i = 0; i < 6; i++) {
			
			char equipo;
			System.out.println("Introduce un personaje de Star Wars");
			

			System.out.println("Introduce 'R' si es Rebelde o 'E' si es del Imperio");
			equipo = scan.nextLine().toCharArray()[0];

			
			if(equipo == 'r' || equipo == 'R' || equipo == 'e' || equipo == 'E') {
						
				if(equipo == 'E' || equipo == 'e') {
					
					if(totalE < 3) {
						
						System.out.println("Introduce su nombre: ");
						String name = scan.nextLine();
						
						System.out.println("Introduce su poder: ");
						int power = scan.nextInt();
						
						System.out.println("Introduce su vida: ");
						int hp = scan.nextInt();
						
						scan.nextLine();
						
						empireCharacters.add(new StarWarsCharacter(name, power, hp));
						totalE++;
					}else {
						System.out.println("Somos demasiados en el Imperio, introduce escoria rebelde");
					}
					
				}else if(equipo == 'R' || equipo == 'r') {
					
					if(totalR < 3) {
						
						System.out.println("Introduce su nombre: ");
						String name = scan.nextLine();
						
						System.out.println("Introduce su poder: ");
						int power = scan.nextInt();
						
						System.out.println("Introduce su vida: ");
						int hp = scan.nextInt();
						
						scan.nextLine();
						
						rebelCharacters.add(new StarWarsCharacter(name, power, hp));
						totalR++;
						
					}else {
						System.out.println("No necesitamos sangre nueva en los Rebeldes, añade algun enemigo con el que acabar");
					}
					
				}
				
			}else {
				System.out.println("Has introducido un equipo que no existe!! Prueba de nuevo");
			}
				
			
		} // End of Adding Characters
	}
}
