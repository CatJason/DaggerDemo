package com.bilibili.dagger.component

import com.bilibili.dagger.BiliMainActivityScope
import com.bilibili.dagger.MainActivity
import com.bilibili.dagger.module.MainActivityComponentModule
import com.bilibili.service.BiliServiceScope
import dagger.Subcomponent

@Subcomponent
interface MainActivitySubcomponent {
    @BiliMainActivityScope
    fun inject(mainActivity: MainActivity)

    @Subcomponent.Factory
    interface Builder {
        fun build(): MainActivitySubcomponent
    }
}