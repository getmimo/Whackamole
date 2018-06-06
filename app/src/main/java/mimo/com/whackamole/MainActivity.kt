package mimo.com.whackamole

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun start(startButton: View) {
        startButton.visibility = View.INVISIBLE
        val nextButton =  findViewById<Button>(R.id.next)
        val inputText = findViewById<EditText>(R.id.input)
        val onScreenElements = arrayOf(nextButton,inputText)
        for (element in onScreenElements) {
            element.visibility = View.VISIBLE
        }
    }


}
