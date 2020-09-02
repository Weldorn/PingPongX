package br.com.welton.pingpongx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_player.*

class PlayerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player)

        btStart.setOnClickListener {
            val nextScreen = Intent(this,MainActivity::class.java)
            nextScreen.putExtra(Constants.KEY_EXTRA_PLAYER_1, etPlayerOne.text.toString())
            nextScreen.putExtra(Constants.KEY_EXTRA_PLAYER_2, etPlayerTwo.text.toString())
            startActivity(nextScreen)
        }
    }
}