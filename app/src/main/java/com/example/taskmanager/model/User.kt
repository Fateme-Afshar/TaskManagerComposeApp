package com.example.taskmanager.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.UUID

@Entity(tableName = "user")
data class User(
    @PrimaryKey @ColumnInfo(name = "id")
    private val id:UUID=UUID.randomUUID(),
    @ColumnInfo(name = "username")
     var username:String,
    @ColumnInfo(name = "password")
    var password:String)
