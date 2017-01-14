package skillsup.practice.spring.dao;

import skillsup.practice.spring.shared.model.User;

import java.util.List;

/**
 * Created by oleksii on 1/14/17.
 */
public interface UserDao extends GenericDao<User> {

	List<User> findUsersByLastName(String lastName);
}