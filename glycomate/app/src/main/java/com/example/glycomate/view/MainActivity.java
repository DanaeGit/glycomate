package com.example.glycomate.view;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import com.example.glycomate.viewmodel.GlucoseViewModel;

public class MainActivity extends AppCompatActivity {
    private GlucoseViewModel glucoseViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        glucoseViewModel = new ViewModelProvider(this).get(GlucoseViewModel.class);
    }
}
