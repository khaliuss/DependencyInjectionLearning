package com.example.dependencyinjectionlearning.example2.data.network

import android.content.Context
import android.util.Log
import com.example.dependencyinjectionlearning.R
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ExampleApiService @Inject constructor(
    val context: Context,
    val timer:Long
) {

    fun method() {
        Log.d(LOG_TAG, "ExampleApiService ${context.getString(R.string.app_name)} $timer $this")
    }

    companion object {
        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}
