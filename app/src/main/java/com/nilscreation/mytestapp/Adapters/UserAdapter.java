package com.nilscreation.mytestapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nilscreation.mytestapp.Models.UserModel;
import com.nilscreation.mytestapp.R;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

    Context context;
    List<UserModel> userlist;

    public UserAdapter(Context context, List<UserModel> userlist) {
        this.context = context;
        this.userlist = userlist;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.user_item, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        UserModel user = userlist.get(position);
        holder.userId.setText("" + user.getUserid());
        holder.userName.setText(user.getUsername());
        holder.country.setText(user.getCountry());

    }

    @Override
    public int getItemCount() {
        return userlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView userId, userName, country;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            userId = itemView.findViewById(R.id.userId);
            userName = itemView.findViewById(R.id.userName);
            country = itemView.findViewById(R.id.country);
        }
    }
}
