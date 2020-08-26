package com.ulmsc.dpolderadults.ui.adBlock;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.ulmsc.dpolderadults.R;
import org.adblockplus.libadblockplus.android.webview.AdblockWebView;


public class AdBlockFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState)
    {
        View root = inflater.inflate(R.layout.fragment_adblock, container, false);
        AdblockWebView webView = (AdblockWebView) root.findViewById(R.id.webView_adblock);
        webView.loadUrl("https://www.rte.ie/");
        // Enabling Adblock with Open Source Library
        webView.setAdblockEnabled(true);
        return root;

    }
}
