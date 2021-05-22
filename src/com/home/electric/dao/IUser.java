package com.home.electric.dao;





import com.home.electric.model.User;

import java.util.List;
import java.util.Map;

public interface IUser {
    User findUseName(String name);
    List<User> findAll();
    void phoneDeleteUser(String phone);
    void insertUser(User user);
    List<User> dynamicSQL(User user);
    List<User> queryUserSql(Map<String, Object> data);
    User getUser(int userId);
    int updateUser(User user);


}
