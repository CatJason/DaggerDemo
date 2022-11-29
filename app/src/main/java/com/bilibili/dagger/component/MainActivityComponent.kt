package com.bilibili.dagger.component

import com.bilibili.dagger.MainActivity
import com.bilibili.service.component.BiliServiceComponent
import dagger.Component

@Component(dependencies = [BiliServiceComponent::class])
interface MainActivityComponent {
    fun inject(mainActivity: MainActivity)
}