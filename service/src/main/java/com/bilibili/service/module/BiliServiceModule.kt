package com.bilibili.service.module

import com.bilibili.reportservice.BiliDanmakuReportService
import com.bilibili.reportservice.BiliReportService
import com.bilibili.reportservice.module.BiliReportServiceModule
import com.bilibili.service.BiliService
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoSet
import javax.inject.Named

@Module
class BiliServiceModule {
    @Provides
    @IntoSet
    fun provideBiliDanmakuService(@Named("danmakuReport") biliReportService: BiliReportService): BiliService {
        return BiliService(biliReportService)
    }

    @Provides
    @IntoSet
    fun provideBiliPlayerService(@Named("playerReport") biliReportService: BiliReportService): BiliService {
        return BiliService(biliReportService)
    }
}