package com.jagteshwar.daggerhiltinandroid.data.repository

import android.app.Application
import com.jagteshwar.daggerhiltinandroid.MyApp
import com.jagteshwar.daggerhiltinandroid.R
import com.jagteshwar.daggerhiltinandroid.data.remote.MyApi
import com.jagteshwar.daggerhiltinandroid.domain.repository.MyRepository
import javax.inject.Inject

class MyRepositoryImpl @Inject constructor(
    private val api: MyApi,
    private val appContext: Application
): MyRepository {

    init {
        val appName = appContext.getString(R.string.app_name)
        println("Hello from the repository, The app name is $appName")
    }
    override suspend fun doNetworkCall() {
        TODO("Not yet implemented")
    }
}