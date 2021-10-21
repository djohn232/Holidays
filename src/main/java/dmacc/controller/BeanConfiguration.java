/**
 * @author Delanie Johnson - dmjohnson33
 * CIS175 - Fall 2021
 * Oct 21, 2021
 */
package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import dmacc.beans.Halloween;
import dmacc.beans.Thanksgiving;

/**
 * @author delan
 *
 */

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Halloween halloween() {
		Halloween bean = new Halloween();
		bean.setCostume("Winnie the Pooh");
		bean.setCandy("Twizzlers");
		return bean;
	}
	
	@Bean
	public Thanksgiving thanksgiving() {
		Thanksgiving bean = new Thanksgiving("Turkey", "Home", "5PM");
		return bean;
	}


}
