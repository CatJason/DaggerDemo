package com.bilibili.reportservice.module

import com.bilibili.reportservice.BiliDanmakuReportService
import com.bilibili.reportservice.BiliPlayerReportService
import com.bilibili.reportservice.BiliReportService
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class BiliReportServiceModule {
    @Named("danmakuReport")
    @Provides
    fun provideBiliDanmakuReportService(): BiliReportService {
        return BiliDanmakuReportService()
    }

    @Named("playerReport")
    @Provides
    fun provideBiliPlayerReportService(): BiliReportService {
        return BiliPlayerReportService()
    }
}