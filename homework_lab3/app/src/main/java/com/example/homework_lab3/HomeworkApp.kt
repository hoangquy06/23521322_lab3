package com.example.homework_lab3

import android.app.Application

class HomeworkApp : Application() {
    override fun onCreate() {
        super.onCreate()
        ServiceLocator.init(this)
    }
}

