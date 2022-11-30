package com.bilibili.reportservice.component

import com.bilibili.reportservice.BiliDanmakuReportService
import com.bilibili.reportservice.BiliPlayerReportService
import com.bilibili.reportservice.BiliReportService
import com.bilibili.reportservice.module.BiliReportServiceModule
import dagger.Component
import javax.inject.Named

@Component(modules = [BiliReportServiceModule::class])
interface BilliReportServiceComponent {
    @Named("danmakuReport")
    fun provideBiliDanmakuReportService(): BiliDanmakuReportService

    @Named("playerReport")
    fun provideBiliPlayerReportService(): BiliReportService
}