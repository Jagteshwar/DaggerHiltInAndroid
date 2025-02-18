package com.jagteshwar.daggerhiltinandroid

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject


@HiltAndroidApp
class MyApp @Inject constructor(): Application()