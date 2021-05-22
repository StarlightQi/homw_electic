package com.home.electric.server;
import com.home.electric.dao.IUser;
import com.home.electric.model.User;
import org.apache.ibatis.session.SqlSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserServer {
    private SqlSession sqlSession = Utils.getSessionFactory().openSession();
    private IUser userMapper = sqlSession.getMapper(IUser.class);


    //  根据用户名称查找用户
    public User findUseName(String name) {
        return userMapper.findUseName(name);
    }

    public User getUser(int userId){
        return userMapper.getUser(userId);
    }

    public List<User> findAll(){
        return userMapper.findAll();
    }
    //    按手机号删除一个用户
    public void phoneDeleteUser(String phone) {
        userMapper.phoneDeleteUser(phone);
        sqlSession.commit();
    }
    //    添加一个用户
    public void addUser(User user) {
        userMapper.insertUser(user);
        sqlSession.commit();
    }
    //    动态查询SQL数据
    public List<User> dynamicSQL(User user) {
        return userMapper.dynamicSQL(user);
    }
    //    分页查询
    public List<User> queryUserBySql(int currPage, int pageSize) {
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("currIndex", (currPage - 1) * pageSize);
        data.put("pageSize", pageSize);
        return userMapper.queryUserSql(data);
    }

    public Boolean updateUser(User user){
        int i =userMapper.updateUser(user);
        sqlSession.commit();
        return i>0;
    }

}