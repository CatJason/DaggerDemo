package com.bilibili.dagger.sevice.component

import com.bilibili.dagger.MainActivity
import com.bilibili.service.module.BiliServiceModule
import dagger.Component

@Component(modules = [BiliServiceModule::class])
interface BiliServiceComponent {
    fun inject(mainActivity: MainActivity)
}