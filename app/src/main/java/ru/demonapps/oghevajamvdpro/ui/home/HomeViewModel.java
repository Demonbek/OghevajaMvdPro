/*
 * *
 *  * Created by DemonApps on 26.08.20 12:34
 *  * Copyright (c) 2020 . All rights reserved.
 *  * Last modified 10.08.20 21:40
 *
 */

package ru.demonapps.oghevajamvdpro.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("1");
    }

    public LiveData<String> getText() {
        return mText;
    }
}