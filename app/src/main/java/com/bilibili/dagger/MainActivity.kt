package com.bilibili.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.bilibili.dagger.sevice.BiliService
import com.bilibili.dagger.sevice.component.DaggerBiliServiceComponent
import com.bilibili.dagger.sevice.module.BiliServiceModule
import dagger.android.DaggerActivity
import dagger.android.DaggerActivity_MembersInjector
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var biliService: BiliService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // DaggerBiliServiceComponent.builder().biliServiceModule(BiliServiceModule()).build().inject(this)
        DaggerBiliServiceComponent.create().inject(this)
    }
}