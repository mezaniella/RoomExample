package com.companyname.room.Dao;

import com.companyname.room.Entity.RegionEntity;

import androidx.room.Dao;
import androidx.room.Insert;

@Dao
public interface RegionDao {

    @Insert
    public void insert(RegionEntity... regionEntities);
}
