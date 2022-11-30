package com.bilibili.dagger.component

import com.bilibili.dagger.MainActivity
import com.bilibili.service.component.BiliServiceComponent
import com.bilibili.service.module.BiliServiceModule
import dagger.Component
import dagger.Subcomponent

@Component(dependencies = [BiliServiceComponent::class])
interface MainActivityComponent {
    fun buildSubComponent(): MainActivitySubComponent
}

