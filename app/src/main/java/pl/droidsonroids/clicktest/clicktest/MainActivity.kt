package pl.droidsonroids.clicktest.clicktest

import android.app.Activity
import android.os.Bundle
import android.view.View

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onImageClick(view: View): Nothing = throw IllegalStateException("Not reachable button clicked")
}
