package com.bilibili.reportservice.module

import com.bilibili.reportservice.BiliDanmakuReportService
import com.bilibili.reportservice.BiliPlayerReportService
import com.bilibili.reportservice.BiliReportService
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class BiliReportServiceModule {
    @Named("danmakuReport")
    @Provides
    @Singleton
    fun provideBiliDanmakuReportService(): BiliReportService {
        return BiliDanmakuReportService()
    }

    @Named("playerReport")
    @Provides
    @Singleton
    fun provideBiliPlayerReportService(): BiliReportService {
        return BiliPlayerReportService()
    }
}