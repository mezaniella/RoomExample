package com.companyname.room.Dao;

import com.companyname.room.Entity.GameEntityRegionEntityCrossRef;

import androidx.room.Dao;
import androidx.room.Insert;

@Dao
public interface GameRegionDao {

    @Insert
    public void insert(GameEntityRegionEntityCrossRef... gameEntityRegionEntityCrossRefs);
}
