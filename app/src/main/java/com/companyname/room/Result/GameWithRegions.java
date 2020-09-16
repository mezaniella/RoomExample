package com.companyname.room.Result;

import com.companyname.room.Entity.GameEntity;
import com.companyname.room.Entity.GameEntityRegionEntityCrossRef;
import com.companyname.room.Entity.RegionEntity;

import java.util.List;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

public class GameWithRegions {

    @Embedded
    public GameEntity Game;

    @Relation(
            parentColumn = "GameId",
            entityColumn = "RegionId",
            associateBy = @Junction(GameEntityRegionEntityCrossRef.class)
    )
    public List<RegionEntity> Regions;
}
