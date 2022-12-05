package com.bilibili.dagger.module

import android.app.Activity
import com.bilibili.dagger.BiliMainActivityScope
import com.bilibili.dagger.component.MainActivitySubcomponent
import dagger.Module
import dagger.android.AndroidInjector

@Module(subcomponents = [MainActivitySubcomponent::class])
abstract class MainActivityComponentModule