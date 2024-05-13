package com.example.taskwise
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.taskwise.databinding.ActivityGetStartBinding

class GetStart : AppCompatActivity() {

    private lateinit var binding: ActivityGetStartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGetStartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set up button click listener
        binding.startButton.setOnClickListener {
            // Start MainActivity when the button is clicked
            startActivity(Intent(this, MainActivity::class.java))
            // Finish this activity so that when the user presses back from MainActivity, they won't come back here
            finish()
        }
    }
}
