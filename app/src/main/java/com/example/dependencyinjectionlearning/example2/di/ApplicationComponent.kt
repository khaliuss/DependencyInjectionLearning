package com.example.dependencyinjectionlearning.example2.di

import android.content.Context
import android.util.Log
import com.example.dependencyinjectionlearning.example2.data.database.ExampleDatabase
import com.example.dependencyinjectionlearning.example2.data.network.ExampleApiService
import com.example.dependencyinjectionlearning.example2.presentation.ExampleViewModel
import com.example.dependencyinjectionlearning.example2.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component
import java.util.Timer
import javax.inject.Singleton

@Singleton
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