package skillsup.practice.spring.dao.impl;

import org.springframework.beans.factory.InitializingBean;
import skillsup.practice.spring.dao.GenericDao;
import skillsup.practice.spring.dao.UserDao;
import skillsup.practice.spring.shared.model.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Created by oleksii on 1/14/17.
 */
public class UserDaoImpl extends GenericDaoImpl<User> implements UserDao {

	private void myInitMethod() {
		System.out.println("Setting up in init method");
	}

	@Override
	public List<User> findUsersByLastName(String lastName) {
		if (lastName == null) {
			return Collections.emptyList();
		}

//		List<User> result = new ArrayList<>();
//
//		for (User user : getDataBase().values()) {
//			if (lastName.equalsIgnoreCase(user.getLastName())) {
//				result.add(user);
//			}
//		}
//
//		return result;

		return getDataBase().values().stream()
				.filter(user ->
						lastName.equalsIgnoreCase(user.getLastName()))
				.collect(toList());
	}
}
