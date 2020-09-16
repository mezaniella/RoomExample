package com.companyname.room.Entity;

import java.util.Date;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Sale")
public class SaleEntity {

    @PrimaryKey
    public int SaleId;


    public int GameId;

    public String CustomerName;



}
