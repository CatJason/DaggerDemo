package com.bilibili.service.component

import com.bilibili.reportservice.component.BilliReportServiceComponent
import com.bilibili.service.BiliServiceScope
import com.bilibili.service.BiliService
import com.bilibili.service.module.BiliServiceModule
import dagger.Component

@Component(
    modules = [BiliServiceModule::class],
    dependencies = [BilliReportServiceComponent::class]
)
@BiliServiceScope
interface BiliServiceComponent {
    fun provideBiliServices(): Map<String, BiliService>
}