package com.example.taskmanager.data.repository

import kotlinx.coroutines.flow.Flow
import java.util.UUID

interface IRepository<T> {
    fun getAll() : Flow<List<T>>
    fun get(id:UUID) : Flow<T>
    fun insert(vararg t:T)
    fun delete(id: UUID)
    fun deleteAll()
    fun update(t:T)
}