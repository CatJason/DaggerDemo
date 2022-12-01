package com.bilibili.service.component

import com.bilibili.reportservice.component.BilliReportServiceComponent
import com.bilibili.service.BiliService
import com.bilibili.service.module.BiliServiceModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

@Component(modules = [BiliServiceModule::class])
interface BiliServiceComponent {
    @Named("danmaku")
    fun provideBiliDanmakuService(): BiliService

    @Named("player")
    fun provideBiliPlayerService(): BiliService

    @Component.Factory
    interface Factory {
        fun create(): BiliServiceComponent

        @BindsInstance
        fun provideBiliDanmakuService(@Named("danmaku") biliService: BiliService): Factory

        @BindsInstance
        fun provideBiliPlayerService(@Named("player") biliService: BiliService): Factory
    }
}