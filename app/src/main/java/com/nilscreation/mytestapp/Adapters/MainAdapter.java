package com.nilscreation.mytestapp.Adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.nilscreation.mytestapp.Models.MainModel;
import com.nilscreation.mytestapp.R;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    Context context;
    ArrayList<MainModel> mainlist;

    public MainAdapter(Context context, ArrayList<MainModel> mainlist) {
        this.context = context;
        this.mainlist = mainlist;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.itemview_main, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MainModel item = mainlist.get(position);
        holder.txtTitle.setText(item.getTitle());

        holder.mainCardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, item.getActivity().getClass());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mainlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtTitle;
        CardView mainCardview;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTitle = itemView.findViewById(R.id.txtTitle);
            mainCardview = itemView.findViewById(R.id.mainCardview);
        }
    }
}
