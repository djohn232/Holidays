package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Halloween;
import dmacc.beans.Thanksgiving;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.HolidaysRepository;

@SpringBootApplication
public class HolidaysApplication {

	public static void main(String[] args) throws Exception {
		HolidaysApplication.run(HolidaysApplication.class, args);
		
		//ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		//Halloween h = appContext.getBean("halloween", Halloween.class);
				//System.out.println(h.toString());
	}

	/**
	 * @param class1
	 * @param args
	 */
	
	@Autowired
	static
	HolidaysRepository repo;
	
	public static void run(Class<HolidaysApplication> class1, String... args) throws Exception {
		ApplicationContext appContext = new
		AnnotationConfigApplicationContext(BeanConfiguration.class);
		//Using an existing bean
		Halloween w = appContext.getBean("halloween", Halloween.class);
		w.setCostume("The Sanderson Sisters");
		repo.save(w);
		
		Halloween e = new Halloween ("Scooby-Doo" , "Twizzlers");
		Thanksgiving t = new Thanksgiving ("Green Beans", "Mom's House","Morning");

		e.setThanksgiving(t);
		
		repo.save(e);
		
		List<Halloween> allHolidays = repo.findAll();
		for(Halloween holiday: allHolidays) {
		System.out.println(holiday.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
	}

}
