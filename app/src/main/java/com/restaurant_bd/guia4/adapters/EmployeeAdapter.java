package com.restaurant_bd.guia4.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.restaurant_bd.guia4.R;
import com.restaurant_bd.guia4.models.EmployeeModel;
import com.restaurant_bd.guia4.viewHolders.EmployeeListViewHolder;

import java.util.List;

public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeListViewHolder> {
    List<EmployeeModel> lstEmployees;

    public EmployeeAdapter(List<EmployeeModel> lstEmployees) {
        this.lstEmployees = lstEmployees;
    }

    @NonNull
    @Override
    public EmployeeListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_employees, parent, false);
        return new EmployeeListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EmployeeListViewHolder holder, int position) {

        holder.getImgAvatar().setImageResource(lstEmployees.get(position).getImgEmployee());
        holder.getTvName().setText(lstEmployees.get(position).getName());
        holder.getTvLastName().setText(lstEmployees.get(position).getLastName());

    }

    @Override
    public int getItemCount() {
        //Nota. Del tamaño de la lista.
        return this.lstEmployees.size();
    }
}
