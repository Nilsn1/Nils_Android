package com.nilscreation.mytestapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class rv_adapter extends RecyclerView.Adapter<rv_adapter.viewholder> {
    Context context;
    ArrayList<rv_model> arrayList;

    public rv_adapter(Context context, ArrayList<rv_model> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public rv_adapter.viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.rv_item, parent, false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull rv_adapter.viewholder holder, int position) {

        rv_model mylist = arrayList.get(position);

        holder.textView.setText(mylist.title);
        holder.imageView.setImageResource(mylist.image);

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public viewholder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageview);
            textView = itemView.findViewById(R.id.textview);

        }
    }
}
