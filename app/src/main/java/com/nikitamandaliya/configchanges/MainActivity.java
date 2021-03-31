package com.nikitamandaliya.configchanges;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

///https://www.youtube.com/watch?v=BU49KDMR1AY
public class MainActivity extends AppCompatActivity {
    private String TAG = "OrientationDemo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e(TAG,"Running oncreate()!");
    }
}