package com.bilibili.dagger.sevice.module

import com.bilibili.dagger.sevice.BiliReportService
import com.bilibili.dagger.sevice.BiliService
import dagger.Module
import dagger.Provides

@Module
class BiliServiceModule(private val reportService: BiliReportService) {
    @Provides
    fun provideBiliService(): BiliService {
        return BiliService()
    }
}