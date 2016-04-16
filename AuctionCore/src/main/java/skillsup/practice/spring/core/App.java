package skillsup.practice.spring.core;

import com.google.gson.Gson;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("spring/core.xml");
		AuctionService service = context.getBean(AuctionService.class);
		Gson gson = context.getBean(Gson.class);


		System.out.println(service);
	}
}