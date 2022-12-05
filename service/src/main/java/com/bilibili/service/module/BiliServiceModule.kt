package com.bilibili.service.module

import com.bilibili.reportservice.BiliReportService
import com.bilibili.service.BiliServiceScope
import com.bilibili.service.BiliService
import com.bilibili.service.BiliServiceMapKey
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import javax.inject.Named

@Module
class BiliServiceModule {
    @Provides
    @IntoMap
    @BiliServiceScope
    @BiliServiceMapKey("danmaku")
    fun provideBiliDanmakuService(@Named("danmakuReport") biliReportService: BiliReportService): BiliService {
        return BiliService(biliReportService)
    }

    @Provides
    @IntoMap
    @BiliServiceScope
    @BiliServiceMapKey("player")
    fun provideBiliPlayerService(@Named("playerReport") biliReportService: BiliReportService): BiliService {
        return BiliService(biliReportService)
    }
}