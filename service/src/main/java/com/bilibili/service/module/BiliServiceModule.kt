package com.bilibili.service.module

import com.bilibili.reportservice.BiliReportService
import com.bilibili.reportservice.module.BiliReportServiceModule
import com.bilibili.service.BiliService
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module(includes = [BiliReportServiceModule::class])
class BiliServiceModule {
    @Provides
    fun provideBiliService(@Named("danmakuReport") biliReportService: BiliReportService): BiliService {
        return BiliService(biliReportService)
    }
}