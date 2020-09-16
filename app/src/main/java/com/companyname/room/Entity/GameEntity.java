package com.companyname.room.Entity;


import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Game")
public class GameEntity {

    @PrimaryKey
    public int GameId;

    public String Name;

    public String Description;

    public int Stock;

}
