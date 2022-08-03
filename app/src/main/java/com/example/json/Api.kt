package com.example.json

import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET("3588163c-a9c8-488c-af9a-534b392e7128")
    fun getData():Call<Item>
}