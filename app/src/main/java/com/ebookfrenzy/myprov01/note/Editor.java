package com.ebookfrenzy.myprov01.note;

import android.os.Bundle;    
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.ebookfrenzy.myprov01.R;

public class Editor extends Fragment {

    String title = null;
    String content = null;
    String date = null;
    String location = null;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.editor,container,false);

        EditText editTitle = view.findViewById(R.id.editTitle);
        editTitle.setText(getTitle());
        EditText editContent = view.findViewById(R.id.editContent);
        editContent.setText(getContent());
        return view;
    }

    //public abstract void save(View v);

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
