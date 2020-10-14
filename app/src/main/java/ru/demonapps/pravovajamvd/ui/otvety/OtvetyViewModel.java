/*
 * *
 *  * Created by DemonApps on 26.08.20 12:34
 *  * Copyright (c) 2020 . All rights reserved.
 *  * Last modified 24.08.20 19:09
 *
 */

package ru.demonapps.pravovajamvd.ui.otvety;

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