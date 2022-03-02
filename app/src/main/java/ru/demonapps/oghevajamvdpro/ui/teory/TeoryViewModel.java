/*
 * *
 *  * Created by DemonApps on 26.08.20 12:34
 *  * Copyright (c) 2020 . All rights reserved.
 *  * Last modified 24.08.20 21:37
 *
 */

package ru.demonapps.oghevajamvdpro.ui.teory;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TeoryViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public TeoryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is teory fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}