package com.bilibili.dagger.component

import com.bilibili.dagger.MainActivity
import com.bilibili.dagger.module.MainActivityComponentModule
import dagger.Subcomponent

@Subcomponent
interface MainActivitySubcomponent {
    fun inject(mainActivity: MainActivity)

    @Subcomponent.Factory
    interface Builder {
        fun build(): MainActivitySubcomponent
    }
}