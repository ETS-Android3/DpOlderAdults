package com.ulmsc.dpolderadults.ui.avoidLinks;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AvoidLinksViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AvoidLinksViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Avoid links");
    }

    public LiveData<String> getText() {
        return mText;
    }
}