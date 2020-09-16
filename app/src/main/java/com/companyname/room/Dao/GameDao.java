package com.companyname.room.Dao;

import com.companyname.room.Entity.GameEntity;
import com.companyname.room.Entity.RegionEntity;
import com.companyname.room.Result.GameWithRegions;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;

@Dao
public interface GameDao {

    @Insert
    public void insert(GameEntity... gameEntities);

    @Insert
    public void insert(GameEntity gameEntity, List<RegionEntity> regionEntityList);

    @Transaction
    @Query("SELECT * FROM Game")
    public List<GameWithRegions> getGameWithRegions();

}
