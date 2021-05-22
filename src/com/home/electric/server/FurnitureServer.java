package com.home.electric.server;


import com.home.electric.dao.IFurniture;
import com.home.electric.model.Furniture;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class FurnitureServer {
    private SqlSession sqlSession = Utils.getSessionFactory().openSession();
    private IFurniture userMapper = sqlSession.getMapper(IFurniture.class);

    public List<Furniture> selectAllFurniture(){
        return userMapper.selectAll();
    }
    public Furniture getFurniture(int furnitureId){
        return userMapper.getFurniture(furnitureId);
    }

    public Boolean addFurniture(Furniture furniture){
        int i=userMapper.addFurniture(furniture);
        sqlSession.commit();
        return i > 0;
    }

    public Boolean deleteFurniture(String furnitureName){
        int i=userMapper.deleteFurniture(furnitureName);
        sqlSession.commit();
        return i > 0;
    }
    public List<Furniture> selectFurniture(Furniture furniture){
        return userMapper.selectFurniture(furniture);
    }

    public Boolean updateFurniture(Furniture furniture){
        int i =userMapper.updateFurniture(furniture);
        sqlSession.commit();
        return i > 0;
    }

    public static void main(String[] args) {
        new FurnitureServer();
    }
}
