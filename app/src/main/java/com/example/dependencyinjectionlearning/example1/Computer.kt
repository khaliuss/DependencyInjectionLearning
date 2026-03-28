package com.example.dependencyinjectionstart.example1

import com.example.dependencyinjectionlearning.example1.ComputerTower
import com.example.dependencyinjectionlearning.example1.Keyboard
import com.example.dependencyinjectionlearning.example1.Monitor
import com.example.dependencyinjectionlearning.example1.Mouse
import javax.inject.Inject

class Computer(
    val monitor: Monitor,
    val computerTower: ComputerTower,
    val keyboard: Keyboard,
    val mouse: Mouse
)
