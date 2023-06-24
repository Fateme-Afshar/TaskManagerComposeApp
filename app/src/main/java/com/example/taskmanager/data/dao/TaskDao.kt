package com.example.taskmanager.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.taskmanager.model.Task
import java.util.UUID

@Dao
interface TaskDao {
    @Query("select * from task")
    suspend fun getAll() : List<Task>

    @Query("select * from task where id=:id")
    suspend fun get(id:UUID) : Task

    @Insert(onConflict =OnConflictStrategy.REPLACE)
     fun insert(vararg task: Task)

    @Query("delete from task where id=:id")
     fun delete(id:UUID)

    @Query("delete from task")
     fun deleteAll()

    @Update
     fun update(task: Task)
}