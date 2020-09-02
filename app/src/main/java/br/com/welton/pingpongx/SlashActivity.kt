package br.com.welton.pingpongx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SlashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slash)

        Handler().postDelayed({
            val nextScreen = Intent(this, PlayerActivity::class.java)
            startActivity(nextScreen)
            finish()
        },2000)
    }
}