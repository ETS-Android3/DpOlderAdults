package com.ulmsc.dpolderadults.ui.centerInfo;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.ulmsc.dpolderadults.MainIntroActivity;
import com.ulmsc.dpolderadults.R;

public class CenterContent extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState)
    {
        View root = inflater.inflate(R.layout.fragment_center_information, container, false);

        return root;
    }
}
