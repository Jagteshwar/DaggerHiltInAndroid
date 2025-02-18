package com.jagteshwar.daggerhiltinandroid.di

import android.app.Application
import com.jagteshwar.daggerhiltinandroid.data.remote.MyApi
import com.jagteshwar.daggerhiltinandroid.data.repository.MyRepositoryImpl
import com.jagteshwar.daggerhiltinandroid.domain.repository.MyRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindsMyRepository(
        myRepositoryImpl: MyRepositoryImpl
    ): MyRepository
}