package ru.demonapps.oghevajamvdpro.ui.teory;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TeoryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TeoryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is teory fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}