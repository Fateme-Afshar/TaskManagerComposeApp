package com.example.taskmanager.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.UUID

@Entity(tableName = "task")
data class Task(
    @PrimaryKey @ColumnInfo(name = "id")
    private val uuid: UUID=UUID.randomUUID(),
    @ColumnInfo(name = "title")
    var title:String,
    @ColumnInfo(name = "description")
    var description:String,
    @ColumnInfo(name = "state")
    var state: State=State.TODO)

enum class State{
    TODO,DOING,DONE
}