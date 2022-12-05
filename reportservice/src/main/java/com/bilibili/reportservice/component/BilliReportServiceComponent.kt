package com.bilibili.reportservice.component

import com.bilibili.reportservice.BiliDanmakuReportService
import com.bilibili.reportservice.BiliPlayerReportService
import com.bilibili.reportservice.BiliReportService
import com.bilibili.reportservice.module.BiliReportServiceModule
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(modules = [BiliReportServiceModule::class])
interface BilliReportServiceComponent {
    @Named("danmakuReport")
    fun provideBiliDanmakuReportService(): BiliReportService

    @Named("playerReport")
    fun provideBiliPlayerReportService(): BiliReportService
}