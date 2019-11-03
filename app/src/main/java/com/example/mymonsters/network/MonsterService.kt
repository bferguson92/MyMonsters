package com.example.mymonsters.network

import com.example.mymonsters.model.MonsterSearch
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MonsterService {
    @GET("monsters")
    fun getMonsters(@Query("search")monster: String) : Call<MonsterSearch>
}