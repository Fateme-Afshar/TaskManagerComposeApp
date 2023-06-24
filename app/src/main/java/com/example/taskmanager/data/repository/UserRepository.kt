package com.example.taskmanager.data.repository

import com.example.taskmanager.data.dao.UserDao
import com.example.taskmanager.model.User
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import java.util.UUID

class UserRepository : IRepository<User>,KoinComponent {
    private val userDao:UserDao by inject()
    override fun getAll(): Flow<List<User>> = flow {
            emit(userDao.getAll())
    }

    override fun get(id: UUID): Flow<User> = flow {
            emit(userDao.get(id))
    }

    override fun delete(id: UUID) {
        userDao.delete(id)
    }

    override fun deleteAll() {
        userDao.deleteAll()
    }

    override fun update(user: User) {
        userDao.update(user)
    }

    override fun insert(vararg user: User) {
        userDao.insert(*user)
    }
}