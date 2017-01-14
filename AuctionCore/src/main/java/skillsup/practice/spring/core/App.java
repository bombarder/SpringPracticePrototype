package skillsup.practice.spring.core;

import com.google.gson.Gson;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import skillsup.practice.spring.core.config.ApplicationConfig;

public class App {

	public static void main(String[] args) {
//		ClassPathXmlApplicationContext context
//				= new ClassPathXmlApplicationContext("spring/core-context.xml");

		GenericApplicationContext context =
				new AnnotationConfigApplicationContext(ApplicationConfig.class);

		AuctionService auctionService = context.getBean(AuctionService.class);

		System.out.println(auctionService);

		Gson gson = context.getBean(Gson.class);
		System.out.println(gson.toJson(auctionService));
	}
}