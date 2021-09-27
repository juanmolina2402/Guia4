package com.restaurant_bd.guia4.viewHolders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.restaurant_bd.guia4.R;

public class EmployeeListViewHolder extends RecyclerView.ViewHolder{
    ImageView imgAvatar;
    TextView tvName, tvLastName;

    public EmployeeListViewHolder(@NonNull View itemView) {
        super(itemView);

        imgAvatar   = (ImageView) itemView.findViewById(R.id.ivAvatar);
        tvName      = (TextView) itemView.findViewById(R.id.tvName);
        tvLastName  = (TextView) itemView.findViewById(R.id.tvLastName);
    }

    public ImageView getImgAvatar() {
        return imgAvatar;
    }

    public TextView getTvName() {
        return tvName;
    }

    public TextView getTvLastName() {
        return tvLastName;
    }
}
