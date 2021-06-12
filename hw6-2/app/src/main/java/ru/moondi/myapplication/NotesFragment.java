package ru.moondi.myapplication;

import android.content.res.TypedArray;
import android.os.Bundle;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class NotesFragment extends Fragment {


    public static final String ARG_INDEX = "index";
    public int index;

    public static NotesFragment newInstance(int index) {
        NotesFragment fragment = new NotesFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_INDEX, index);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            index = getArguments().getInt(ARG_INDEX);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_notes, container, false);
        TextView tvNoteName = view.findViewById(R.id.tvNoteName);
        TextView tvNoteDate = view.findViewById(R.id.tvNoteDate);
        TextView tvNoteDescription = view.findViewById(R.id.tvNoteDescription);
        TextView tvNoteText = view.findViewById(R.id.tvNoteText);


        String notesName[] = getResources().getStringArray(R.array.nameNotes);
        String notesDate[] = getResources().getStringArray(R.array.dateNotes);
        String notesDescription[] = getResources().getStringArray(R.array.descriptionNotes);
        String notesText[] = getResources().getStringArray(R.array.textNotes);

        tvNoteName.setText(notesName[index]);
        tvNoteDate.setText(notesDate[index]);
        tvNoteDescription.setText(notesDescription[index]);
        tvNoteText.setText(notesText[index]);


        return view;
    }
}