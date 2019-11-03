package com.example.mymonsters.viewmodel

import androidx.lifecycle.ViewModel
import com.example.mymonsters.model.MonsterSearch
import com.example.mymonsters.model.Result
import com.example.mymonsters.network.MonsterFactory
import com.example.mymonsters.util.Logger
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

 class MonsterViewModel(private val view: MonsterView): ViewModel() {

    private val monsterFactory = MonsterFactory()

    fun getMonsters(monster: String) {
        monsterFactory.getMonsters(monster).enqueue(object : Callback<MonsterSearch> {
            override fun onFailure(call: Call<MonsterSearch>, t: Throwable) {
                Logger.error(t)
            }

            override fun onResponse(call: Call<MonsterSearch>, response: Response<MonsterSearch>) {
                response.body()?.let {monsterSearch->
                    Logger.test("onResponse fired!")
                     view.displayMonsters(monsterSearch.results)
                }
            }
        })
    }

     interface MonsterView {
         fun displayMonsters(monsters: List<Result>)
     }

}