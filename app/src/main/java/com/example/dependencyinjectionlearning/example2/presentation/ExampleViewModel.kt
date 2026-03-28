package com.example.dependencyinjectionlearning.example2.presentation

import com.example.dependencyinjectionlearning.example2.domain.ExampleUseCase

class ExampleViewModel(
    private val useCase: ExampleUseCase
) {

    fun method() {
        useCase()
    }
}
