/**
 * 
 */
package character;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Fran Azorin
 *
 */
public class Team {

	private List<SWCharacter> team;
	
	public Team() {
		
	}
	public Team(SWCharacter c1, SWCharacter c2, SWCharacter c3) {
		
		team = new ArrayList<SWCharacter>();
		team.add(c1);
		team.add(c2);
		team.add(c3);
		
	}
	
	
	/**
	 * @return the team
	 */
	public List<SWCharacter> getTeam() {
		return team;
	}
	/**
	 * @param team the team to set
	 */
	public void setTeam(ArrayList<SWCharacter> team) {
		this.team = team;
	}
		
}
