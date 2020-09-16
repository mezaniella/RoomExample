package com.companyname.room.Dao;

import com.companyname.room.Entity.SaleEntity;

import androidx.room.Dao;
import androidx.room.Insert;

@Dao
public interface SaleDao {

    @Insert
    public void insert(SaleEntity... saleEntities);
}
