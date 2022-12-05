package com.bilibili.dagger.component

import com.bilibili.dagger.BiliMainActivityScope
import com.bilibili.dagger.MainActivity
import com.bilibili.dagger.module.MainActivityComponentModule
import com.bilibili.service.BiliServiceScope
import com.bilibili.service.component.BiliServiceComponent
import com.bilibili.service.module.BiliServiceModule
import dagger.Component
import dagger.Subcomponent

@BiliMainActivityScope
@Component(modules = [MainActivityComponentModule::class], dependencies = [BiliServiceComponent::class])
interface MainActivityComponent {
    fun getSubComponentBuilder(): MainActivitySubcomponent.Builder
}

