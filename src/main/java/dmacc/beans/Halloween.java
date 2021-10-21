/**
 * @author Delanie Johnson - dmjohnson33
 * CIS175 - Fall 2021
 * Oct 21, 2021
 */
package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author delan
 *
 */
@Entity
public class Halloween {
	@Id
	@GeneratedValue
	private long id;
	private String costume;
	private String candy;
	@Autowired
	private Thanksgiving thanksgiving;
	
	public Thanksgiving getThanksgiving() {
		return thanksgiving;
	}

	public void setThanksgiving(Thanksgiving thanksgiving) {
		this.thanksgiving = thanksgiving;
	}

	public Halloween() {
		super();
		this.candy = "chocolate";
		
	}
	
	public Halloween(String costume) {
		
	}

	public Halloween(String costume, String candy) {
		
	}
	
	public Halloween(int id, String costume, String candy) {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCostume() {
		return costume;
	}

	public void setCostume(String costume) {
		this.costume = costume;
	}

	public String getCandy() {
		return candy;
	}

	public void setCandy(String candy) {
		this.candy = candy;
	}

	@Override
	public String toString() {
		return "Halloween [id=" + id + ", costume=" + costume + ", candy=" + candy + ", thanksgiving=" + thanksgiving
				+ "]";
	}


	
	
}
