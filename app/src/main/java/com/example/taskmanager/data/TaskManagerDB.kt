package com.example.taskmanager.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.taskmanager.data.dao.TaskDao
import com.example.taskmanager.data.dao.UserDao
import com.example.taskmanager.model.Task
import com.example.taskmanager.model.User

@Database(entities = [Task::class, User::class], version = 1)
abstract class TaskManagerDB : RoomDatabase(){
    abstract fun taskDao() : TaskDao
    abstract fun userDao() : UserDao
}