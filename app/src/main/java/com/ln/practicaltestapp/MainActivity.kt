package com.ln.practicaltestapp

import android.graphics.Paint
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_layout.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity()
{
    lateinit var adapter: TestAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        getTest()


        txt1.setPaintFlags(txt1.getPaintFlags() or Paint.STRIKE_THRU_TEXT_FLAG)
    }


    private fun getTest()
    {

        val places = TestService.testInstance.getDetails("0","0", "22.572646","88.36389500000001","0","100","true")

        places.enqueue(object : Callback<TestModel>
        {
            override fun onResponse(call: Call<TestModel>, response: Response<TestModel>)
            {
                val places = response.body()

                if (places!=null)
                {
                    Log.d("fgh" , places.toString())


                    recycler_view.layoutManager = LinearLayoutManager(this@MainActivity)

                    adapter = TestAdapter(this@MainActivity , places.data.orEmpty())

                    recycler_view.adapter = adapter

                }
            }

            override fun onFailure(call: Call<TestModel>, t: Throwable)
            {
                Log.d("fgh" , "Error in fetching places" , t)
            }

        })

    }



}