package com.bilibili.dagger.sevice.component

import com.bilibili.dagger.MainActivity
import com.bilibili.dagger.sevice.module.BiliServiceModule
import dagger.Component

@Component
interface BiliServiceComponent {
    fun inject(activity: MainActivity)
}