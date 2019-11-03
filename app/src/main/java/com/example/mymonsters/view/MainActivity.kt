package com.example.mymonsters.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mymonsters.R
import com.example.mymonsters.adapter.MonsterAdapter
import com.example.mymonsters.model.Result
import com.example.mymonsters.util.Logger
import com.example.mymonsters.viewmodel.MonsterViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MonsterViewModel.MonsterView {


    private val monsterViewModel = MonsterViewModel(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button_search.setOnClickListener{
            Logger.test("Button clicked")
            monsterViewModel.getMonsters(edit_monster_search.text.toString())
        }
    }

    override fun displayMonsters(monsters: List<Result>) {
        Logger.test("displayed called")
        recycler_monster.adapter = MonsterAdapter(monsters)
        recycler_monster.layoutManager = LinearLayoutManager(this)
    }

}
