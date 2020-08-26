package com.ulmsc.dpolderadults.ui.verticalScroll;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

// a model file for vertical scrolling
public class VerticalScrollViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public VerticalScrollViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Vertical Scroll");
    }

    public LiveData<String> getText() {
        return mText;
    }
}