package com.example.dependencyinjectionlearning.example2.di

import android.content.Context
import android.util.Log
import com.example.dependencyinjectionlearning.example2.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component
import java.util.Timer

@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

    fun inject(mainActivity: MainActivity)

    @Component.Factory
    interface ApplicationComponentFactory{

        fun create(
            @BindsInstance context: Context,
            @BindsInstance timer: Long
        ): ApplicationComponent

    }

}