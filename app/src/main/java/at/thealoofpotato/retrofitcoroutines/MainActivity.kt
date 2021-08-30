package at.thealoofpotato.retrofitcoroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import at.thealoofpotato.retrofitcoroutines.API.API
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.awaitResponse

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getCurrentData()

    }

    private fun getCurrentData() {
        GlobalScope.launch(Dispatchers.IO) {
            val response = API.api.getCatFacts().awaitResponse()
            if(response.isSuccessful){
                val data = response.body()!!
                Log.d("Bruh", data.text)
            }
        }
    }

}