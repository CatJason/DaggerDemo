package com.bilibili.dagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bilibili.reportservice.component.DaggerBilliReportServiceComponent
import com.bilibili.service.BiliService
import com.bilibili.service.component.DaggerBiliServiceComponent
import com.bilibili.service.module.BiliServiceModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var biliServices: Map<String, BiliService>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}