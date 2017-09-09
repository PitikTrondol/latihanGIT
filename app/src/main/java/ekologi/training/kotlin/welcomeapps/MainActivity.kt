package ekologi.training.kotlin.welcomeapps

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
//import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        val test = jajalReturn(5, 6)
        val test2 = jajalReturn2(7, 8)

//        Log.d("TEST","JInguk "+test+"jinguk"+test2);
    }

    //
    fun jajalReturn (a : Int, b : Int) : Int = a + b
    fun jajalReturn2 (a : Int, b : Int) : Int
    {
        return a + b
    }
}
