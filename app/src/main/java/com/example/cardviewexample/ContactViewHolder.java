package com.example.cardviewexample;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ContactViewHolder extends RecyclerView.ViewHolder {

    ImageView contact_img;
    TextView contact_name;
    TextView contact_num;
    ImageView contact_call;

    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);

        contact_img=itemView.findViewById(R.id.img);
        contact_name=itemView.findViewById(R.id.text_android);
        contact_num=itemView.findViewById(R.id.desc);
    }
}
