package com.bilibili.service.module

import com.bilibili.reportservice.BiliReportService
import com.bilibili.reportservice.module.BiliReportServiceModule
import com.bilibili.service.BiliService
import dagger.Module
import dagger.Provides

@Module(includes = [BiliReportServiceModule::class])
class BiliServiceModule {
    @Provides
    fun provideBiliService(biliReportService: BiliReportService): BiliService {
        return BiliService(biliReportService)
    }
}