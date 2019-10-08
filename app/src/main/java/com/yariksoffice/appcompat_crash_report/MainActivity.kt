package com.yariksoffice.appcompat_crash_report

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.CheckBox
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.DrawableCompat
import androidx.core.widget.CompoundButtonCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<CheckBox>(R.id.checkbox)

        val buttonDrawable = CompoundButtonCompat.getButtonDrawable(button)!!
        Log.d(TAG, "Initial: ${buttonDrawable::class.java.simpleName}")
        val wrapper = DrawableCompat.wrap(buttonDrawable)
        Log.d(TAG, "Wrapper: ${wrapper::class.java.simpleName}")

        DrawableCompat.setTint(wrapper, ContextCompat.getColor(this, R.color.colorPrimary))
        button.buttonDrawable = wrapper
    }

    companion object {
        private const val TAG = "TAG"
    }
}
