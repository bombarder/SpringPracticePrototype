package skillsup.practice.spring.dao;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import skillsup.practice.spring.shared.model.User;

import java.util.Arrays;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("spring/dao-context.xml");

        UserDao userDao = context.getBean(UserDao.class);
        System.out.println(userDao);

        GenericDao<?> genericRef = context.getBean("userDao", GenericDao.class);
        System.out.println(userDao == genericRef);

        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));

        Map<String, GenericDao> beansOfType = context.getBeansOfType(GenericDao.class);

    }
}
