package com.example.com.exmple.android;

import android.os.Bundle;
import android.preference.PreferenceFragment;

public class MyPreferencesFragmemt extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }
}
