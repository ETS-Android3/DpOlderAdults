package com.ulmsc.dpolderadults.ui.verticalScroll;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.ulmsc.dpolderadults.R;

public class VerticalScrollFragment extends Fragment {

    private VerticalScrollViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(VerticalScrollViewModel.class);
        View root = inflater.inflate(R.layout.fragment_vertical_scroll, container, false);
        final WebView webView = root.findViewById(R.id.webview_vertical_scroll);
        WebSettings webSettings = webView.getSettings();
        webView.loadUrl("https://www.ageaction.ie/");
        webSettings.setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setSupportZoom(true);
        return root;
    }
}