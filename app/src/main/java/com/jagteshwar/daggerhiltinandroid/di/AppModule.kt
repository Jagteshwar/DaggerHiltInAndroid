package com.jagteshwar.daggerhiltinandroid.di

import android.app.Application
import com.jagteshwar.daggerhiltinandroid.MyApp
import com.jagteshwar.daggerhiltinandroid.data.remote.MyApi
import com.jagteshwar.daggerhiltinandroid.data.repository.MyRepositoryImpl
import com.jagteshwar.daggerhiltinandroid.domain.repository.MyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideMyApi():MyApi{
        return Retrofit.Builder()
            .baseUrl("https://test.com")
            .build()
            .create(MyApi::class.java)
    }

//    @Provides
//    @Singleton
//    fun providesMyRepository(api: MyApi, app: Application):MyRepository{
//        return MyRepositoryImpl(api, app)
//    }
}