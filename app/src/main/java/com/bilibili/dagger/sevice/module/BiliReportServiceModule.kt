package com.bilibili.dagger.sevice.module

import com.bilibili.dagger.sevice.BiliReportService
import com.bilibili.dagger.sevice.BiliService
import dagger.Module
import dagger.Provides

@Module
class BiliReportServiceModule {
    @Provides
    fun provideBiliReportService(): BiliReportService {
        return BiliReportService()
    }
}