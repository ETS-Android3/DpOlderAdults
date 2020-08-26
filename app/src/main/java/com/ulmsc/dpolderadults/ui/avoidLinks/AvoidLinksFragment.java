package com.ulmsc.dpolderadults.ui.avoidLinks;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.ulmsc.dpolderadults.R;

import java.util.Objects;

public class AvoidLinksFragment extends Fragment {

    private AvoidLinksViewModel slideshowViewModel;
    private WebView webView;
   // private MyWebViewClient MyWebViewClient;

    @SuppressLint("SetJavaScriptEnabled")
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                ViewModelProviders.of(this).get(AvoidLinksViewModel.class);
        View root = inflater.inflate(R.layout.fragment_avoid_links, container, false);
        webView = (WebView)root.findViewById(R.id.webview_avoid_links);
        webView.setWebViewClient(new MyWebViewClient());
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.loadUrl("https://www.rte.ie");
        return root;
    }

    // Making a web client to allow similar links with in the app
    private static class MyWebViewClient extends WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            // It the particular links belongs to a different web address it will be blocked automatically.
            // In this example i am using rte news website so any URL outside of RTE website will not open
            if(Objects.requireNonNull(Uri.parse(url).getHost()).endsWith("www.rte.ie")) {
                return false;
            }
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            view.getContext().startActivity(intent);
            return true;
        }
        @Override
        public boolean shouldOverrideKeyEvent (WebView view, KeyEvent event) {

            return true;
        }
    }


}