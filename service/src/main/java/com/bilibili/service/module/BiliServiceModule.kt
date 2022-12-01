package com.bilibili.service.module

import com.bilibili.reportservice.BiliDanmakuReportService
import com.bilibili.reportservice.BiliReportService
import com.bilibili.reportservice.module.BiliReportServiceModule
import com.bilibili.service.BiliService
import com.bilibili.service.BiliServiceMapKey
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import dagger.multibindings.IntoSet
import dagger.multibindings.StringKey
import javax.inject.Named

@Module
class BiliServiceModule {
    @Provides
    @IntoMap
    @BiliServiceMapKey("danmaku")
    fun provideBiliDanmakuService(@Named("danmakuReport") biliReportService: BiliReportService): BiliService {
        return BiliService(biliReportService)
    }

    @Provides
    @IntoMap
    @BiliServiceMapKey("player")
    fun provideBiliPlayerService(@Named("playerReport") biliReportService: BiliReportService): BiliService {
        return BiliService(biliReportService)
    }
}