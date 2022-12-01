package com.bilibili.service.component

import com.bilibili.reportservice.component.BilliReportServiceComponent
import com.bilibili.service.BiliService
import com.bilibili.service.BiliServiceMapKey
import com.bilibili.service.module.BiliServiceModule
import dagger.Component
import javax.inject.Named

@Component(
    modules = [BiliServiceModule::class],
    dependencies = [BilliReportServiceComponent::class]
)
interface BiliServiceComponent {
    fun provideBiliServices(): Map<String, BiliService>
}