package com.bilibili.service.module

import com.bilibili.reportservice.BiliDanmakuReportService
import com.bilibili.reportservice.BiliReportService
import com.bilibili.reportservice.module.BiliReportServiceModule
import com.bilibili.service.BiliService
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class BiliServiceModule {
    @Provides
    @Named("danmaku")
    fun provideBiliDanmakuService(@Named("danmakuReport") biliReportService: BiliReportService): BiliService {
        return BiliService(biliReportService)
    }

    @Provides
    @Named("player")
    fun provideBiliPlayerService(@Named("playerReport") biliReportService: BiliReportService): BiliService {
        return BiliService(biliReportService)
    }
}