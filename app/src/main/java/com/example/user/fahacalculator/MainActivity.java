package com.example.user.fahacalculator;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.example.user.fahacalculator.presenters.MainPresenter;
import com.example.user.fahacalculator.views.PhoneView;

public class MainActivity extends AppCompatActivity implements MainPresenter {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeFragment(new PhoneView());
    }

    //
    @Override
    public boolean isTablet() {
        return false;
    }

    private void changeFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.main_constraint_layout, fragment, "Current_Fragment").commit();
    }
}
