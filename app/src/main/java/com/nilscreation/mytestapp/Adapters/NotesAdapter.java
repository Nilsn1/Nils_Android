package com.nilscreation.mytestapp.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nilscreation.mytestapp.DBHandler;
import com.nilscreation.mytestapp.Models.NotesModel;
import com.nilscreation.mytestapp.R;
import com.nilscreation.mytestapp.SQLiteNotesDetailActivity;

import java.util.ArrayList;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.ViewHolder> {

    Context context;
    ArrayList<NotesModel> noteslist;

    public NotesAdapter(Context context, ArrayList<NotesModel> noteslist) {
        this.context = context;
        this.noteslist = noteslist;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_sqlite, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        NotesModel notes = noteslist.get(position);
        holder.noteTitle.setText(notes.getTitle());
        holder.noteDescription.setText(notes.getDescription());
        holder.noteTime.setText(notes.getTime());

        holder.noteBackground.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, SQLiteNotesDetailActivity.class);
                intent.putExtra("Title", notes.getTitle());
                intent.putExtra("Description", notes.getDescription());
                intent.putExtra("Time", notes.getTime());
                context.startActivity(intent);
            }
        });

        holder.noteBackground.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                DBHandler dbHandler = new DBHandler(context);
                dbHandler.deleteData(notes.getTitle());
                noteslist.remove(notes);
                notifyDataSetChanged();
                Toast.makeText(context, "Note Deleted Successfully", Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }

    @Override
    public int getItemCount() {
        return noteslist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView noteTitle, noteDescription, noteTime;
        LinearLayout noteBackground;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            noteTitle = itemView.findViewById(R.id.noteTitle);
            noteDescription = itemView.findViewById(R.id.noteDescription);
            noteTime = itemView.findViewById(R.id.noteTime);
            noteBackground = itemView.findViewById(R.id.noteBack);
        }
    }
}
