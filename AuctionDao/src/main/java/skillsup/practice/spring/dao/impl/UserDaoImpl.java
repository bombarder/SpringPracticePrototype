package skillsup.practice.spring.dao.impl;

import skillsup.practice.spring.dao.UserDao;
import skillsup.practice.spring.shared.model.User;

import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class UserDaoImpl extends GenericDaoImpl<User> implements UserDao {

    @Override
    public List<User> findUsersByLastName(String lastName) {
        if (lastName == null){
            return Collections.emptyList();
        }

//        List<User> result = new ArrayList<>();
//
//        for (User user:getDataBase().values()){
//            if (lastName.equalsIgnoreCase(user.getLastName())){
//                result.add(user);
//            }
//        }
//        return result;

        return getDataBase().values().stream()
                .filter(user ->
                        lastName.equalsIgnoreCase(user.getLastName()))
                .collect(toList());
    }

    public void myInitMethod() throws Exception {
        System.out.println("Setting up in init method");
    }
}
