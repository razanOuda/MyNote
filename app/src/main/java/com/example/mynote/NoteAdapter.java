package com.example.mynote;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NoteAdapter extends FirestoreRecyclerAdapter<Note,NoteAdapter.NoteViewHolder> {
    class NoteViewHolder extends RecyclerView.ViewHolder{

        TextView titleTextView, contentTextView, timestampTextView;

        public NoteViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.note_title_text_view);
            contentTextView = itemView.findViewById(R.id.note_content_text_view);
            timestampTextView = itemView.findViewById(R.id.note_time_text_view);

        }
    }
}
