package com.bilibili.reportservice.component

import com.bilibili.reportservice.BiliReportService
import com.bilibili.reportservice.module.BiliReportServiceModule
import dagger.Component
import javax.inject.Named

@Component(modules = [BiliReportServiceModule::class])
interface BilliReportServiceComponent {
    @Named("danmakuReport")
    fun provideBiliDanmakuReportService(): BiliReportService
}