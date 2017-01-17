package skillsup.practice.spring.dao;

import skillsup.practice.spring.shared.model.User;

import java.util.List;

public interface UserDao extends GenericDao<User>{
    List<User> findUsersByLastName(String lastname);
}
