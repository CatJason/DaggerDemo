package com.bilibili.dagger.sevice.module

import com.bilibili.dagger.sevice.BiliReportService
import com.bilibili.dagger.sevice.BiliService
import dagger.Module
import dagger.Provides

@Module(includes = [BiliReportServiceModule::class])
class BiliServiceModule {
    @Provides
    fun provideBiliService(biliReportService: BiliReportService): BiliService {
        return BiliService(biliReportService)
    }
}