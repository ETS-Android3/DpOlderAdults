package com.ulmsc.dpolderadults.ui.intro;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.ulmsc.dpolderadults.MainIntroActivity;
import com.ulmsc.dpolderadults.R;

import org.adblockplus.libadblockplus.android.webview.AdblockWebView;

public class AppIntro extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState)
    {
        View root = inflater.inflate(R.layout.fragment_appintro, container, false);
        Button launchbutton = (Button) root.findViewById(R.id.button_launch_intro);
        launchbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MainIntroActivity.class);
                startActivity(intent);
            }
        });
        return root;

    }
}
