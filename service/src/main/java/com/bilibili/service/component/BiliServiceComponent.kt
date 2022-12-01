package com.bilibili.service.component

import com.bilibili.reportservice.BiliDanmakuReportService
import com.bilibili.reportservice.BiliPlayerReportService
import com.bilibili.reportservice.BiliReportService
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

    @Component.Builder
    interface Builder {
        fun create(): BiliServiceComponent

        @BindsInstance
        fun provideBiliDanmakuService(@Named("danmakuReport") biliReportService: BiliReportService): Builder

        @BindsInstance
        fun provideBiliPlayerService(@Named("playerReport") biliReportService: BiliReportService): Builder
    }
}