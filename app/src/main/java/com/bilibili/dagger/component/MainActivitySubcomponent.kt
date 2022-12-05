package com.bilibili.dagger.component

import com.bilibili.dagger.MainActivity
import com.bilibili.dagger.module.MainActivityComponentModule
import com.bilibili.service.BiliServiceScope
import dagger.Subcomponent

@BiliServiceScope
@Subcomponent
interface MainActivitySubcomponent {
    fun inject(mainActivity: MainActivity)

    @Subcomponent.Factory
    interface Builder {
        fun build(): MainActivitySubcomponent
    }
}