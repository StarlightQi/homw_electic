package com.home.electric.dao;

import com.home.electric.model.Furniture;

import java.util.List;

public interface IFurniture {
    List<Furniture> selectAll(); // 查询全部
    Furniture getFurniture(int furnitureId);
    int addFurniture(Furniture furniture); //添加电器
    List<Furniture> selectFurniture(Furniture furniture); // 查找
    int deleteFurniture(String furnitureName); //删除电器
    int updateFurniture(Furniture furniture);

}
