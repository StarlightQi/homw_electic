package com.home.electric.model;

public class Other {
    private int otherId;
    private int otherCount;// 购买数量
    private User userId;//购买用户Id
    private Furniture furnitureId;// 购买物品IP

    public int getOtherId() {
        return otherId;
    }

    public void setOtherId(int otherId) {
        this.otherId = otherId;
    }

    public int getOtherCount() {
        return otherCount;
    }

    public void setOtherCount(int otherCount) {
        this.otherCount = otherCount;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Furniture getFurnitureId() {
        return furnitureId;
    }

    public void setFurnitureId(Furniture furnitureId) {
        this.furnitureId = furnitureId;
    }

    @Override
    public String toString() {
        return "Other{" +
                "otherId=" + otherId +
                ", otherCount=" + otherCount +
                ", userId=" + userId +
                ", furnitureId=" + furnitureId +
                '}';
    }
}
