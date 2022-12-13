package character;

public abstract class SWCharacter {

	private int force;
	private int hp;
	private int dodge;
	private int luck;
	private int shield;
	private int critical;
	
	public SWCharacter(int force, int hp, int dodge, int luck, int shield, int critical) {
		
		this.force = force;
		this.hp = hp;
		this.dodge = dodge;
		this.luck = luck;
		this.shield = shield;
		this.critical = critical;
	}

	
	
	/**
	 * @return the force
	 */
	public int getForce() {
		return force;
	}

	/**
	 * @param force the force to set
	 */
	public void setForce(int force) {
		this.force = force;
	}

	/**
	 * @return the hp
	 */
	public int getHp() {
		return hp;
	}

	/**
	 * @param hp the hp to set
	 */
	public void setHp(int hp) {
		this.hp = hp;
	}

	/**
	 * @return the dodge
	 */
	public int getDodge() {
		return dodge;
	}

	/**
	 * @param dodge the dodge to set
	 */
	public void setDodge(int dodge) {
		this.dodge = dodge;
	}

	/**
	 * @return the luck
	 */
	public int getLuck() {
		return luck;
	}

	/**
	 * @param luck the luck to set
	 */
	public void setLuck(int luck) {
		this.luck = luck;
	}

	/**
	 * @return the shield
	 */
	public int getShield() {
		return shield;
	}

	/**
	 * @param shield the shield to set
	 */
	public void setShield(int shield) {
		this.shield = shield;
	}

	/**
	 * @return the critical
	 */
	public int getCritical() {
		return critical;
	}

	/**
	 * @param critical the critical to set
	 */
	public void setCritical(int critical) {
		this.critical = critical;
	}
	
	
	
}
