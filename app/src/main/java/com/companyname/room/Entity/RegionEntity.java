package com.companyname.room.Entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity( tableName = "Region")
public class RegionEntity {

    @PrimaryKey
    public int RegionId;

    public String Name;


}
