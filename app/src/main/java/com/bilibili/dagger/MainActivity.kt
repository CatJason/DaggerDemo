package com.bilibili.dagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bilibili.dagger.sevice.BiliService
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var biliService: BiliService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // DaggerBiliServiceComponent.create().inject(this)
        MainActivity_MembersInjector.injectBiliService(this, BiliService())
    }
}