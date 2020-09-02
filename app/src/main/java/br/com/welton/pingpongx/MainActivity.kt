package br.com.welton.pingpongx

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var playerOneScore = 0
    private var playerTwoScore = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        savedInstanceState?.let {
            playerOneScore = it.getInt("playerOneScore", 0)
            playerTwoScore = it.getInt("playerTwoScore", 0)
            setupScorePlayerOne()
            setupScorePlayerTwo()
        }
        setupPlayers()
        setupListners()
    }

    private fun setupListners() {
        btPlayerOneScore.setOnClickListener {
            playerOneScore++
            setupScorePlayerOne()
        }

        btPlayerTwoScore.setOnClickListener{
            playerTwoScore++
            setupScorePlayerTwo()
        }
        btnRematch.setOnClickListener{
            rematch()
        }

        btFinish.setOnClickListener{
            finish()
        }
    }

    private fun setupScorePlayerOne() {
        tvPlayerOneScore.text = playerOneScore.toString()
    }

    private fun setupScorePlayerTwo() {
        tvPlayerTwoScore.text = playerTwoScore.toString()
    }

    private fun setupPlayers() {
        tvPlayerOneName.text = intent.getStringExtra(Constants.KEY_EXTRA_PLAYER_1)
        tvPlayerTwoName.text = intent.getStringExtra(Constants.KEY_EXTRA_PLAYER_2)
        }

    private fun rematch() {
        playerOneScore = 0
        playerTwoScore = 0
        setupScorePlayerOne()
        setupScorePlayerTwo()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("playerOneScore", playerOneScore)
        outState.putInt("playerTwoScore", playerTwoScore)
    }
}