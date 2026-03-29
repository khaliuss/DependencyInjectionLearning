package com.example.dependencyinjectionlearning.example2.di

import com.example.dependencyinjectionlearning.example2.data.repository.ExampleRepositoryImpl
import com.example.dependencyinjectionlearning.example2.domain.ExampleRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DomainModule {

    @Binds
    fun bindExampleRepository(impl: ExampleRepositoryImpl): ExampleRepository

}