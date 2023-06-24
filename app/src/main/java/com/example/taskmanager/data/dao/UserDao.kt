package com.example.taskmanager.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.taskmanager.model.User
import java.util.UUID

@Dao
interface UserDao {
    @Query("select * from user")
    suspend fun getAll() : List<User>

    @Query("select * from user where id=:id")
    suspend fun get(id: UUID) : User

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(vararg user: User)

    @Query("delete from user where id=:id")
    fun delete(id: UUID)

    @Query("delete from user")
    fun deleteAll()

    @Update
    fun update(user: User)
}