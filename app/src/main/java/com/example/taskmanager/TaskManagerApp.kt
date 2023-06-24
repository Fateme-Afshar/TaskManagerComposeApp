package com.example.taskmanager

import android.app.Application
import com.example.taskmanager.di.appModule
import com.example.taskmanager.di.databaseModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class TaskManagerApp : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin{
            androidLogger()
            androidContext(this@TaskManagerApp)
            modules(appModule, databaseModule)
        }
    }
}