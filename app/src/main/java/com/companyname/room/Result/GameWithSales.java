package com.companyname.room.Result;


import com.companyname.room.Entity.GameEntity;
import com.companyname.room.Entity.SaleEntity;

import java.util.List;

import androidx.room.Embedded;
import androidx.room.Relation;

public class GameWithSales {

    @Embedded
    public GameEntity Game;

    @Relation(
            parentColumn = "GameId",
            entityColumn = "SaleId"
    )
    public List<SaleEntity> Sales;
}
