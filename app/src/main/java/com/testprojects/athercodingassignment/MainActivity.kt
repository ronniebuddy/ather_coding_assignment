package com.testprojects.athercodingassignment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.testprojects.athercodingassignment.databinding.ActivityMainBinding
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var mainActivityBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainActivityBinding =
            ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainActivityBinding.root)
        val calendar: Calendar = Calendar.getInstance()

        // Format date time in the format "Wednesday, January 11"
        val simpleDateFormat = SimpleDateFormat("EEEE, MMMM DD", Locale.US)
        val dateTime = simpleDateFormat.format(calendar.time).uppercase()
        mainActivityBinding.tvCurrentDate.text = dateTime
    }
}