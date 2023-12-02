package com.example.zametki;

import androidx.cardview.widget.CardView;

import com.example.zametki.Models.Notes;

public interface NotesClickListener {

    void onClick (Notes notes);
    void onLongClick(Notes notes, CardView cardView);

}
