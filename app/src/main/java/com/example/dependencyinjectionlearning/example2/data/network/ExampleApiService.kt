package com.example.dependencyinjectionlearning.example2.data.network

import android.content.Context
import android.util.Log
import com.example.dependencyinjectionlearning.R
import javax.inject.Inject

class ExampleApiService @Inject constructor(
    val context: Context,
    val timer:Long
) {

    fun method() {
        Log.d(LOG_TAG, "ExampleApiService ${context.getString(R.string.app_name)} $timer")
    }

    companion object {
        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}
