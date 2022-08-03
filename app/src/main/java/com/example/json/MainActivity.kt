package com.example.json

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.squareup.moshi.Moshi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.Callable


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val retrofit = Retrofit.Builder()
            .baseUrl("https://run.mocky.io/v3/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()

        val service: Api = retrofit.create(Api::class.java)

        service.getData().enqueue(object : Callback<Item> {
            override fun onResponse(call: Call<Item>, response: Response<Item>) {
                println(response.body())
                println(response.body()?.equipment?.equipmentMedia)
            }

            override fun onFailure(call: Call<Item>, t: Throwable) {
                println(t)
            }
        })
    }
}