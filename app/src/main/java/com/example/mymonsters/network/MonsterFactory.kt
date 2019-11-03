package com.example.mymonsters.network

import com.example.mymonsters.model.MonsterSearch
import com.example.mymonsters.util.Constants
import com.example.mymonsters.util.Logger
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MonsterFactory {

    private  var  monsterService: MonsterService

    init {
        monsterService = createMonsterService(getRetrofitInstance())
    }

    private fun getRetrofitInstance() : Retrofit {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    private fun createMonsterService(retrofit: Retrofit) : MonsterService {
        return retrofit.create(MonsterService::class.java)
    }

    fun getMonsters(monster: String) : Call<MonsterSearch> {
        Logger.test("Query called")
       return monsterService.getMonsters(monster)
    }
}