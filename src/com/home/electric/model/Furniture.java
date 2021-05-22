package com.home.electric.model;

public class Furniture {
    private int furnitureId;
    private String furnitureName; // 家电名字
    private int furnitureCount; // 家电总数量
    private int furnitureSellCount; // 家电卖出数量
    private int furniturePrice; //家电价格
    private String describes; // 家电描述

    public int getFurnitureId() {
        return furnitureId;
    }

    public void setFurnitureId(int furnitureId) {
        this.furnitureId = furnitureId;
    }

    public String getFurnitureName() {
        return furnitureName;
    }

    public void setFurnitureName(String furnitureName) {
        this.furnitureName = furnitureName;
    }

    public int getFurnitureCount() {
        return furnitureCount;
    }

    public void setFurnitureCount(int furnitureCount) {
        this.furnitureCount = furnitureCount;
    }

    public int getFurnitureSellCount() {
        return furnitureSellCount;
    }

    public void setFurnitureSellCount(int furnitureSellCount) {
        this.furnitureSellCount = furnitureSellCount;
    }

    public int getFurniturePrice() {
        return furniturePrice;
    }

    public void setFurniturePrice(int furniturePrice) {
        this.furniturePrice = furniturePrice;
    }

    public String getDescribes() {
        return describes;
    }

    public void setDescribes(String describe) {
        this.describes = describe;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "furnitureId=" + furnitureId +
                ", furnitureName='" + furnitureName + '\'' +
                ", furnitureCount=" + furnitureCount +
                ", furnitureSellCount=" + furnitureSellCount +
                ", furniturePrice=" + furniturePrice +
                ", describe='" + describes + '\'' +
                '}';
    }
}
