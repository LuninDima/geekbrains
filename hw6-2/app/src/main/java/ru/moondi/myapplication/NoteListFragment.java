package ru.moondi.myapplication;

import android.content.Intent;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class NoteListFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_note_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle saveInstanceState){
        super.onViewCreated(view, saveInstanceState);
        initList(view);
    }
    private void initList(View view){
        LinearLayout layoutView = (LinearLayout) view;
        String[] nameNotes = getResources().getStringArray(R.array.nameNotes);
        for(int i = 0; i < nameNotes.length; i++){
            String nameNote = nameNotes[i];
            TextView tv = new TextView(getContext());
            tv.setText(nameNote);
            tv.setTextSize(30);
            layoutView.addView(tv);
            final  int fi = i;
            tv.setOnClickListener(new View.OnClickListener(){
                @Override
                        public void onClick(View v) {
                    showPortNotes(fi);
                }
            });
        }
    }
    private void showPortNotes(int index){
        Intent intent = new Intent();
        intent.setClass(getActivity(), NoteActivity.class);
        intent.putExtra(NotesFragment.ARG_INDEX, index);
        startActivity(intent);
    }
}