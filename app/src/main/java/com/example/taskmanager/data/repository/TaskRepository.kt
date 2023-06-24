package com.example.taskmanager.data.repository

import com.example.taskmanager.model.Task
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.util.UUID

class TaskRepository : IRepository<Task> {
    override fun getAll(): Flow<List<Task>> = flow {

    }

    override fun get(id: UUID): Flow<Task> = flow {

    }

    override fun delete(id: UUID) {
        TODO("Not yet implemented")
    }

    override fun deleteAll() {
        TODO("Not yet implemented")
    }

    override fun update(task: Task) {
        TODO("Not yet implemented")
    }

    override fun insert(vararg task: Task) {
        TODO("Not yet implemented")
    }
}