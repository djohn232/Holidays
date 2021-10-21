/**
 * @author Delanie Johnson - dmjohnson33
 * CIS175 - Fall 2021
 * Oct 21, 2021
 */
package dmacc.beans;

import javax.persistence.Embeddable;

/**
 * @author delan
 *
 */
@Embeddable
public class Thanksgiving {

	private String food;
	private String location;
	private String time;
	
	public Thanksgiving() {
		
	}
	
	public Thanksgiving (String food, String location, String time) {
		
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Thanksgiving [food=" + food + ", location=" + location + ", time=" + time + "]";
	}
	
	
	
}
