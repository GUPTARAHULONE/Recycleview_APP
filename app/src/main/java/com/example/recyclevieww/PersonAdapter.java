package com.example.recyclevieww;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.ViewHolder> {

    private ArrayList<Person> people;

    public PersonAdapter( Context context,ArrayList<Person> list) {
        people=list;
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView ivPref;
        TextView tvName,tvSurname;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvName=itemView.findViewById(R.id.tvName);
            tvSurname=itemView.findViewById(R.id.tvSurname);
            ivPref=itemView.findViewById(R.id.ivPref);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
        }
    }

    public PersonAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonAdapter.ViewHolder holder, int position) {

        holder.itemView.setTag(people.get(position));
        holder.tvName.setText(people.get(position).getName());
        holder.tvSurname.setText(people.get(position).getSurname());

        if(people.get(position).getPreference().equals("ic_baseline_direction_bus_24"))
        {
            holder.ivPref.setImageResource(R.drawable.ic_baseline_directions_bus_24);
        }
        else
        {
            holder.ivPref.setImageResource(R.drawable.ic_baseline_airplanemode_active_24);
        }



    }

    @Override
    public int getItemCount() {
        return people.size();
    }
}
