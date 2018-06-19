package mimo.com.whackamole

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.support.constraint.ConstraintLayout
import android.widget.ImageButton

class GameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
    }

    fun startGame() {
        val image = pickImage()
    }

    fun pickImage() : ImageButton {
        val images = findViewById<ConstraintLayout>(R.id.gameLayout).touchables
        images.shuffle()
        val randomImage = images[0] as ImageButton
        randomImage.setImageResource(R.drawable.ic_active)
        return randomImage
    }

}
