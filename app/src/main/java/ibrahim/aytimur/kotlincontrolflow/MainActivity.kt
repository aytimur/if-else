package ibrahim.aytimur.kotlincontrolflow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // if yapısı
        // Geleneksel kullanım
      /*  var a = 4
        var b = 5
        var enbuyuk = 0
        if (a<b)
            enbuyuk = b
        if (a>b)
            enbuyuk = a
        textView.text = enbuyuk.toString()*/

        // if else birlikte kullanımı
      /*  var a = 4
        var b = 5
        var enbuyuk = 0
        if (a<b){
            enbuyuk = b
        }
        else {
            enbuyuk =a
        }
        textView.text = enbuyuk.toString()*/

        // if eğer bir ifade - bir değer olarak kullanılırsa
        var a = 4
        var b = 5
        var enbuyuk = if (a>b) a else b
        textView.text = enbuyuk.toString()
    }
}
