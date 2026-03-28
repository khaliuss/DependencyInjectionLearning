package com.example.dependencyinjectionlearning.example2.di

import com.example.dependencyinjectionlearning.example2.presentation.MainActivity
import dagger.Component

@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

    fun inject(mainActivity: MainActivity)

}