package com.ulmsc.dpolderadults.ui.largeContent;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.ulmsc.dpolderadults.R;

public class LargeContentFragment extends Fragment {

    private LargeContentViewModel galleryViewModel;
    private ScaleGestureDetector mScaleGestureDetector;
    private float mScaleFactor = 1.0f;
    private ImageView imageView;
    private TextView textView1, textView2, textView3,textView4;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel = ViewModelProviders.of(this).get(LargeContentViewModel.class);
        View root = inflater.inflate(R.layout.fragment_large_content, container, false);
        imageView = (ImageView) root.findViewById(R.id.imageViewAvatar);
        imageView.setImageResource(R.drawable.avtar_boy);
        mScaleGestureDetector = new ScaleGestureDetector(getContext(), new ScaleListener());
//        final TextView textView = root.findViewById(R.id.text_gallery);
//        galleryViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        textView1 = (TextView) root.findViewById(R.id.tvLCF1);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView1.setTextSize(25);
                textView2.setTextSize(15);
                textView3.setTextSize(15);
                textView4.setTextSize(15);
            }
        });
        textView2 = (TextView) root.findViewById(R.id.tvLCF2);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView1.setTextSize(15);
                textView2.setTextSize(25);
                textView3.setTextSize(15);
                textView4.setTextSize(15);
            }
        });
        textView3 = (TextView) root.findViewById(R.id.tvLCF3);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView1.setTextSize(15);
                textView2.setTextSize(15);
                textView3.setTextSize(25);
                textView4.setTextSize(15);
            }
        });
        textView4 = (TextView) root.findViewById(R.id.tvLCF4);
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView1.setTextSize(15);
                textView2.setTextSize(15);
                textView3.setTextSize(15);
                textView4.setTextSize(25);
            }
        });
        return root;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        mScaleGestureDetector.onTouchEvent(motionEvent);
        return true;
    }

    private class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        @Override
        public boolean onScale(ScaleGestureDetector scaleGestureDetector){
            mScaleFactor *= scaleGestureDetector.getScaleFactor();
            mScaleFactor = Math.max(0.1f,
                    Math.min(mScaleFactor, 10.0f));
            imageView.setScaleX(mScaleFactor);
            imageView.setScaleY(mScaleFactor);
            return true;
        }
    }
}