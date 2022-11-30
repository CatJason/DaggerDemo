package com.bilibili.reportservice.module

import com.bilibili.reportservice.BiliDanmakuReportService
import com.bilibili.reportservice.BiliPlayerReportService
import com.bilibili.reportservice.BiliReportService
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
abstract class BiliReportServiceModule {
    @Binds
    @Named("danmakuReport")
    abstract fun bindBiliDanmakuReportServiceFactory(biliDanmakuReportService: BiliDanmakuReportService): BiliReportService

    @Binds
    @Named("playerReport")
    abstract fun bindBiliPlayerReportServiceFactory(biliPlayerReportService: BiliPlayerReportService): BiliReportService
}