package mimo.com.whackamole

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var status = "Storage status:"
        val total = 64.0
        var used = 64.0
        var freeSpace = total - used

        print(status)

        if (freeSpace == 0.0) {
            print("Storage full!")
        } else if (freeSpace <= 1) {
            print("Storage low")
        }


    }
}
