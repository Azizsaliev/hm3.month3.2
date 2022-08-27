package com.example.myapplication;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AddressViewHolder extends RecyclerView.ViewHolder {
    private TextView textViewAddress;
    public AddressViewHolder(@NonNull View itemView) {
        super(itemView);
    textViewAddress = itemView.findViewById(R.id.item_address);
    }
   public void bind(String address){
        textViewAddress.setText(address);

   }


}
