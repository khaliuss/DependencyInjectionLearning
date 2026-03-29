package com.example.dependencyinjectionlearning.example2.di

import android.content.Context
import com.example.dependencyinjectionlearning.example2.data.datasource.ExampleLocalDataSource
import com.example.dependencyinjectionlearning.example2.data.datasource.ExampleLocalDataSourceImpl
import com.example.dependencyinjectionlearning.example2.data.datasource.ExampleRemoteDataSource
import com.example.dependencyinjectionlearning.example2.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DataModule {

    @Binds
    fun bindExampleLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @Binds
    fun bindsExampleRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

}