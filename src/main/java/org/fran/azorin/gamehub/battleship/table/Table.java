package org.fran.azorin.gamehub.battleship.table;

import org.fran.azorin.gamehub.battleship.ships.Cruise;
import org.fran.azorin.gamehub.battleship.ships.Ship;

/**
 * @author Fran Azorin
 *
 */
public class Table {

	private String[][] table;
	private int size;
	
	public Table() {
		table = new String[10][10];
		size = 10;
		setWater(size);
	}
	public Table(int n) {
		table = new String[n][n];
		this.size = n;
		setWater(size);
	}
	
	
	/**
	 * @return the table
	 */
	public String[][] getTable() {
		return table;
	}
	/**
	 * @param table the table to set
	 */
	public void setTable(String[][] table) {
		this.table = table;
	}
	
	public void setWater(int n) {
		
		for(int i = 0; i < n; i++) {
			
			for(int j = 0; j < n; j++) {
				
				table[i][j] = "O";
			}
		}
	}
	
	public void setShip() {
		
		Ship c = new Cruise();
		
		c.getSize();
		table[3][3] = c.getType();
		table[4][3] = c.getType();
	}
	
	
}
