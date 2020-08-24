package ru.demonapps.oghevajamvdpro.ui.otvety;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class OtvetyViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public OtvetyViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Фрагмент Ответы");
    }

    public LiveData<String> getText() {
        return mText;
    }
}