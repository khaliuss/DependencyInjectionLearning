package com.example.dependencyinjectionlearning.example1

import com.example.dependencyinjectionstart.example1.Computer
import javax.inject.Inject

class Activity {

    @Inject
    lateinit var computer: Computer


    init {
        DaggerNewComponent.create().inject(this)
    }

}