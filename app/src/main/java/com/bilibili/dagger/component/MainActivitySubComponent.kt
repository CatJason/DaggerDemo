package com.bilibili.dagger.component

import com.bilibili.dagger.MainActivity
import dagger.Subcomponent

@Subcomponent
interface MainActivitySubComponent {
    fun subInject(mainActivity: MainActivity)
}