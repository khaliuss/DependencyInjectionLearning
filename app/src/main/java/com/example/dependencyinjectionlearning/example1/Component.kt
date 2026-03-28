package com.example.dependencyinjectionlearning.example1

import com.example.dependencyinjectionstart.example1.Computer

class Component {

    private fun getComputer(): Computer{
        val monitor = Monitor()
        val keyboard = Keyboard()
        val mouse = Mouse()
        val computerTower = ComputerTower(
            Storage(),
            Memory(),
            Processor()
        )
        return Computer(monitor, computerTower, keyboard, mouse)
    }

//    fun inject(activity: Activity){
//        activity.keyboard = Keyboard()
//    }

}