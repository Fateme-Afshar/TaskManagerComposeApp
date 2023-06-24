package com.example.taskmanager.di

import androidx.room.Room
import com.example.taskmanager.data.TaskManagerDB
import com.example.taskmanager.data.repository.TaskRepository
import com.example.taskmanager.data.repository.UserRepository
import com.example.taskmanager.presentation.loginScreen.LoginVm
import com.example.taskmanager.presentation.signUpScreen.SignUpVm
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

    val appModule= module {
        single {
            TaskRepository()
            UserRepository()
        }

        viewModel {
                LoginVm(get())
                SignUpVm(get())
        }
    }


val databaseModule = module {
    single {
        Room.databaseBuilder(
            androidContext(),
            TaskManagerDB::class.java,
            "task-manager-app"
        ).build()
    }

    single {
        get<TaskManagerDB>().taskDao()
        get<TaskManagerDB>().userDao()
    }
}

