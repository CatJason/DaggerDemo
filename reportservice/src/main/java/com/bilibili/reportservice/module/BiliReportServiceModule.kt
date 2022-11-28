package com.bilibili.reportservice.module

import com.bilibili.reportservice.BiliReportService
import dagger.Module
import dagger.Provides

@Module
class BiliReportServiceModule {
    @Provides
    fun provideBiliReportService(): BiliReportService {
        return BiliReportService()
    }
}