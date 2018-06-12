package mimo.com.whackamole

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.support.constraint.ConstraintLayout
import android.widget.ImageButton
import android.widget.TextView

class GameActivity : AppCompatActivity() {

    var score = 0
    var playerScore : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        playerScore = findViewById(R.id.score)
        startGame()
    }

    fun startGame() {
        val image = pickImage()
        makeImageActive(image).start()
    }

    fun pickImage() : ImageButton {
        val images = findViewById<ConstraintLayout>(R.id.gameLayout).touchables
        images.shuffle()
        val randomImage = images[0] as ImageButton
        randomImage.setImageResource(R.drawable.ic_active)
        return randomImage
    }

    fun makeImageActive(image: ImageButton) : CountDownTimer {
        image.setOnClickListener {
            image.setImageResource(R.drawable.ic_success)
            score++
            playerScore?.text = score.toString()
        }

        return object : CountDownTimer(1000, 100) {

            override fun onTick(millisUntilFinished: Long) {

            }

            override fun onFinish() {
                image.setImageResource(R.drawable.ic_inactive)
                image.setOnClickListener(null)
                startGame()
            }

        }
    }
}
