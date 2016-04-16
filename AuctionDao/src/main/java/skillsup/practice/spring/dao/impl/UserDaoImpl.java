package skillsup.practice.spring.dao.impl;

import skillsup.practice.spring.dao.UserDao;
import skillsup.practice.spring.shared.model.User;

/**
 * Created by oleksii on 4/16/16.
 */
public class UserDaoImpl extends GenericDaoImpl<User>
		implements UserDao {

	public void init() {
		User user = new User();
		user.setName("James");
		user.setLastName("Heatfield");
		user.setContactPhone("+3809312123123");
		user.setDeliveryAddress("California");

		save(user);


		getLogger().info("In init method of UserDao");
	}
}
