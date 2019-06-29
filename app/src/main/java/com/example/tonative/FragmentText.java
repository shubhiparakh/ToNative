package com.example.tonative;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

public class FragmentText extends Fragment {
    EditText input_text, output_text;
    ImageView button_text;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      View view = inflater.inflate(R.layout.fragmenttext,container,false);
      input_text=view.findViewById(R.id.input_text);
      output_text=view.findViewById(R.id.output_text);
      button_text=view.findViewById(R.id.button_text);
      return view;


    }
}
