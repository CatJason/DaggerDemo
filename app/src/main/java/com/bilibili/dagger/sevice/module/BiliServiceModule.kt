package com.bilibili.dagger.sevice.module

import com.bilibili.dagger.sevice.BiliService
import dagger.Module
import dagger.Provides

@Module
class BiliServiceModule {
    @Provides
    fun provideBiliService(): BiliService {
        return BiliService()
    }
}