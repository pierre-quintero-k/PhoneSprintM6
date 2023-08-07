package com.example.phonesprintm6.Model.Remote

import com.example.phonesprintm6.Model.Remote.FromInet.PhoneDetail
import com.example.phonesprintm6.Model.Remote.FromInet.Phone
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface PhoneApi {

    @GET("products")
    suspend fun fetchPhoneList(): Response<List<Phone>>

    @GET("details/{id}")
    suspend fun fetchPhoneDetail(@Path("id")id: String): Response<PhoneDetail>
}