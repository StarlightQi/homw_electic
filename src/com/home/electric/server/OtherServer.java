package com.home.electric.server;
import com.home.electric.dao.IOther;
import com.home.electric.model.Other;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class OtherServer {
    private SqlSession sqlSession = Utils.getSessionFactory().openSession();
    private IOther otherMapper = sqlSession.getMapper(IOther.class);

    public Boolean addOther(Other other){
        int i=otherMapper.addOther(other);
        sqlSession.commit();
        return i > 0;
    }
    public List<Other> findAllOther(){
        return otherMapper.findAll();
    }
    public Other findOther(int id){
        return otherMapper.findOther(id);
    }

    public static void main(String[] args) {
        OtherServer server=new OtherServer();
        System.out.println(server.findOther(5));
    }

}
