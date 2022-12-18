package com.abit.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.ViewHolder> {
    private final LayoutInflater inflater;
    private final List<Persons> personList;

    public PersonAdapter(Context context, List<Persons> personList) {
        this.inflater = LayoutInflater.from(context);
        this.personList = personList;
    }


    @NonNull
    @Override
    public PersonAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull PersonAdapter.ViewHolder holder, int position) {
        Persons person = personList.get(position);
        holder.nameView.setText(person.getName());
        holder.name2View.setText(person.getSecondName());
    }

    @Override
    public int getItemCount() {
        return personList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final TextView nameView, name2View;
        ViewHolder(@NonNull View itemView) {
            super(itemView);
            nameView = itemView.findViewById(R.id.name);
            name2View = itemView.findViewById(R.id.name2);


        }
    }
}
