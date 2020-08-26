package com.ulmsc.dpolderadults.ui.largeContent;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LargeContentViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public LargeContentViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Large Content");
    }

    public LiveData<String> getText() {
        return mText;
    }
}