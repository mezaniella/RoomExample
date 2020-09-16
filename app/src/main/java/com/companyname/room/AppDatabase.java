package com.companyname.room;

import com.companyname.room.Dao.GameDao;
import com.companyname.room.Dao.GameRegionDao;
import com.companyname.room.Dao.RegionDao;
import com.companyname.room.Dao.SaleDao;
import com.companyname.room.Entity.GameEntity;
import com.companyname.room.Entity.GameEntityRegionEntityCrossRef;
import com.companyname.room.Entity.RegionEntity;
import com.companyname.room.Entity.SaleEntity;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database( entities = {GameEntity.class, RegionEntity.class, SaleEntity.class, GameEntityRegionEntityCrossRef.class}, version =  1)
public abstract class AppDatabase extends RoomDatabase{

    public abstract GameDao gameDao();

    public abstract RegionDao regionDao();

    public abstract SaleDao saleDao();

    public abstract GameRegionDao gameRegionDao();
}
