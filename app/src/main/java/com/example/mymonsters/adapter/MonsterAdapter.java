package com.example.mymonsters.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mymonsters.R;
import com.example.mymonsters.model.Result;

import java.util.List;

public class MonsterAdapter extends RecyclerView.Adapter<MonsterAdapter.CustomViewHolder> {
    private List<Result> monsters;

    public MonsterAdapter(List<Result> monsters) {
        this.monsters = monsters;
    }


    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CustomViewHolder(LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.monster_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        holder.monster.setText(monsters.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return monsters.size();
    }

    class CustomViewHolder extends RecyclerView.ViewHolder{
        TextView monster = itemView.findViewById(R.id.text_monster);

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }


}
