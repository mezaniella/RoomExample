package com.companyname.room.Entity;


import androidx.room.Entity;

@Entity(tableName = "GameEntity", primaryKeys = {"GameId", "RegionId"})
public class GameEntityRegionEntityCrossRef {

    public  int GameId;

    public int RegionId;

    public double Price;
}
