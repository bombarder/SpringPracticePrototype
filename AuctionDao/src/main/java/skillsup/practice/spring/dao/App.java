package skillsup.practice.spring.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import skillsup.practice.spring.shared.model.User;

import java.util.Map;

public class App {

	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("spring/dao.xml");

		GenericDao<User> userDao = context.getBean("userDao", GenericDao.class);


	}
}
