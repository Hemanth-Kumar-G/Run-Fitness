package com.hemanth.runfitness.di

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.hemanth.runfitness.db.RunningDatabase
import com.hemanth.runfitness.utilites.Constants.RUNNING_DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideRunningDatabase(@ApplicationContext context: Context) = Room.databaseBuilder(
        context, RunningDatabase::class.java, RUNNING_DATABASE_NAME
    )

    @Singleton
    @Provides
    fun provideRunDao(db:RunningDatabase)=db.runDoa()
}