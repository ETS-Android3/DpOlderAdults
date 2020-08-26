# Design Patterns recommmendations for developers for developing samrtphone applications for OlderAdults
A prototype application for set of design recommendations for developers, developing applications for Older Adults. This application is a part of
my Master's research project. 

## Usage example

Check out this example. How one of my recommendation for application (To avoid ads as much as possible inside your app) would be implement. You can use your own logic and design this
is just an example.

_A fragment of class for blocking ads inside a webview._
```public class AdBlockFragment extends Fragment {

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
```

## Development setup

To install this application find the apk file in repo.
To setup this repo locally download it or fork it from Android Studio

## Meta

Mohammad Tauseef Khan – [@mtktausseef](https://twitter.com/mtktauseef)

[https://github.com/mtktauseef/DpOlderAdults](https://github.com/mtktauseef/)
