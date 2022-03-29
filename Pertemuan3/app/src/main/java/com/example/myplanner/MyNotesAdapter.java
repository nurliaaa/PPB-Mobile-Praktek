package com.example.myplanner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyNotesAdapter extends RecyclerView.Adapter<MyNotesAdapter.ViewHolder>{

    MyNotes[] myNotes;
    Context context;

    public MyNotesAdapter(MyNotes[] myNotes,MainActivity4 activity4 ) {
        this.myNotes = myNotes;
        this.context = activity4;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_notes,parent,false);
        ViewHolder viewholder = new ViewHolder(view);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final MyNotes myNotesList = myNotes[position];
        holder.textViewTitle.setText(myNotesList.getTitle());
        holder.textViewDate.setText(myNotesList.getDate());
        holder.textViewNotes.setText(myNotesList.getNotes());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, myNotesList.getTitle(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return myNotes.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textViewTitle;
        TextView textViewDate;
        TextView textViewNotes;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            textViewTitle = itemView.findViewById(R.id.textTitle);
            textViewDate = itemView.findViewById(R.id.textDate);
            textViewNotes = itemView.findViewById(R.id.textNotes);
        }
    }
}
