package com.bilibili.reportservice.module

import com.bilibili.reportservice.BiliReportService
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class BiliReportServiceModule {
    @Provides
    @Named("danmakuReport")
    fun provideBiliDanmakuReportService(): BiliReportService {
        return BiliReportService("danmaku")
    }

    @Provides
    @Named("playerReport")
    private fun provideBiliPlayerReportService(): BiliReportService {
        return BiliReportService("player")
    }
}