package com.ln.practicaltestapp

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query


//https://www.spotoffers.com/api/appapi/getofferlist?category_id=0&subcategory_id=&latitude=22.572646&longitude=88.36389500000001&page=1&remaining_offer=0&distance=100&discount=true


const val BASE_URL = "https://www.spotoffers.com/"
//const val API_KEY = "AIzaSyDpt4kr1T0DlMcUlmJgibeTSaLzEKOvcFM"


interface TestInterface
{
    //@Headers("devicetype","deviceid")
    @GET("https://www.spotoffers.com/api/appapi/getofferlist?")
    fun getDetails(@Query("category_id") category_id : String? , @Query("subcategory_id") subcategory_id : String? , @Query("latitude") latitude : String? , @Query("longitude") longitude : String? , @Query("remaining_offer") remaining_offer : String? , @Query("distance") distance : String? , @Query("discount") discount : String? ) : Call<TestModel>
}

object TestService
{
    val testInstance : TestInterface



    init
    {
        val interceptor = HttpLoggingInterceptor()
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)

//        val headers = HashMap<String, String>()
//        headers["deviceid"] = "test"
//        headers["devicetype"] = "1"



        val client: OkHttpClient = OkHttpClient.Builder().addInterceptor(interceptor).build()

        val retrofit = Retrofit.Builder()
           .baseUrl(BASE_URL)
           .addConverterFactory(GsonConverterFactory.create())
           .client(client)
           .build()



        testInstance = retrofit.create(TestInterface :: class.java)


    }
}