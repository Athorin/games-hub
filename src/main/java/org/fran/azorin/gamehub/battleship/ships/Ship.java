/**
 * 
 */
package ships;

/**
 * @author Fran Azorin
 *
 */
public class Ship {

	private int size;
	private String type;
	private int hits;
	private boolean alive;
	
	public Ship() {
		
	}
	
	public Ship(int size, String type, int hits, boolean alive) {
		
		this.size = size;
		this.type = type;
		this.hits = hits;
		this.alive = alive;
	}
	
	
	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the hits
	 */
	public int getHits() {
		return hits;
	}

	/**
	 * @param hits the hits to set
	 */
	public void setHits(int hits) {
		this.hits = hits;
	}

	/**
	 * @return the condition
	 */
	public boolean isAlive() {
		return alive;
	}

	/**
	 * @param condition the condition to set
	 */
	public void setAlive(boolean alive) {
		this.alive = alive;
	}


}
