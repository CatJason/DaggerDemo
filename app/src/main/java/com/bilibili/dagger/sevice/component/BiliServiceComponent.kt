package com.bilibili.dagger.sevice.component

import com.bilibili.dagger.sevice.module.BiliServiceModule
import dagger.Component

@Component(modules = [BiliServiceModule::class])
abstract class BiliServiceComponent {

}