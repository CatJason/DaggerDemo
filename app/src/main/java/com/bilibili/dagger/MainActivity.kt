package com.bilibili.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bilibili.dagger.sevice.BiliService
import com.bilibili.dagger.sevice.component.BiliServiceComponent
import com.bilibili.dagger.sevice.component.DaggerBiliServiceComponent
import com.bilibili.dagger.sevice.module.BiliServiceModule
import com.bilibili.dagger.sevice.module.BiliServiceModule_ProvideBiliServiceFactory
import dagger.android.DaggerActivity
import dagger.android.DaggerActivity_MembersInjector
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var biliService: BiliService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // biliService = DaggerBiliServiceComponent.create().provideBiliService()
        biliService = BiliServiceModule_ProvideBiliServiceFactory.provideBiliService(BiliServiceModule())
    }
}