# Design Patterns recommmendations for developers for developing samrtphone applications for OlderAdults
A prototype application for set of design recommendations for developers, developing applications for Older Adults. This application is a part of
my Master's research project. 

## Development setup

To install this application find the apk file in repo.
To setup this repo locally download it or fork it from Android Studio

## Meta

Mohammad Tauseef Khan – [@mtktausseef](https://twitter.com/mtktauseef)

[https://github.com/mtktauseef/DpOlderAdults](https://github.com/mtktauseef/)




## Usage example

Check out this example. How one of my recommendation for application (To avoid ads as much as possible inside your app) would be implement. You can use your own logic and design this is just an example.

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

_A code fragment of layout file for placing content in center._

```
<LinearLayout
            android:id="@+id/center_content_layout"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_alignParentTop="true"
            android:layout_marginTop="230dp"
            android:gravity="center_horizontal"
            android:orientation="vertical"
            android:weightSum="1">

            <EditText
                android:id="@+id/editTextTextPersonName2"
                android:layout_width="377dp"
                android:layout_height="wrap_content"
                android:layout_marginStart="2dp"
                android:layout_marginTop="8dp"
                android:layout_marginEnd="0dp"
                android:ems="10"
                android:hint="Name"
                android:inputType="textPersonName"
                app:layout_constraintTop_toTopOf="parent" />

            <EditText
                android:id="@+id/editTextTextPersonName3"
                android:layout_width="372dp"
                android:layout_height="wrap_content"
                android:layout_marginStart="2dp"
                android:ems="10"
                android:hint="Address"
                android:inputType="textPersonName" />

            <EditText
                android:id="@+id/editTextPhone"
                android:layout_width="374dp"
                android:layout_height="wrap_content"
                android:layout_marginStart="2dp"
                android:ems="10"
                android:hint="Phone Number"
                android:inputType="phone" />

            <EditText
                android:id="@+id/editTextTextEmailAddress"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginStart="2dp"
                android:layout_marginEnd="0dp"
                android:ems="10"
                android:hint="Email"
                android:inputType="textEmailAddress"
                app:layout_constraintStart_toStartOf="parent" />
        </LinearLayout>
```        
