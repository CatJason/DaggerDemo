package com.bilibili.dagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bilibili.dagger.component.DaggerMainActivityComponent
import com.bilibili.reportservice.BiliDanmakuReportService
import com.bilibili.reportservice.BiliPlayerReportService
import com.bilibili.reportservice.component.DaggerBilliReportServiceComponent
import com.bilibili.service.BiliService
import com.bilibili.service.component.DaggerBiliServiceComponent
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity() {
    @Inject
    @Named("danmaku")
    lateinit var biliService: BiliService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val biliServiceComponent = DaggerBiliServiceComponent.builder()
            .provideBiliDanmakuService(BiliDanmakuReportService())
            .provideBiliPlayerService(BiliPlayerReportService())
            .create()

        DaggerMainActivityComponent.builder()
            .biliServiceComponent(biliServiceComponent)
            .build()
            .getSubComponentBuilder()
            .build()
            .inject(this)
    }
}