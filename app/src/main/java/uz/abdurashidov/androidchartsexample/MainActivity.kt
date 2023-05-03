package uz.abdurashidov.androidchartsexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import uz.abdurashidov.androidchartsexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy{ActivityMainBinding.inflate(layoutInflater)}

    fun draw(view : View) {

        val arrayList = ArrayList<Int>()

        arrayList.add( Integer.valueOf(binding.edt1.text.toString()))
        arrayList.add( Integer.valueOf(binding.edt2.text.toString()))
        arrayList.add( Integer.valueOf(binding.edt3.text.toString()))
        arrayList.add( Integer.valueOf(binding.edt4.text.toString()))

        val intent = Intent(this,PieChartActivity::class.java)
        intent.putIntegerArrayListExtra("arrayList",arrayList)
        startActivity(intent)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


    }
}