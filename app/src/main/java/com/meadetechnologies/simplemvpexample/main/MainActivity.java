package com.meadetechnologies.simplemvpexample.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.meadetechnologies.simplemvpexample.R;
import com.meadetechnologies.simplemvpexample.databinding.ActivityMainBinding;

/**
 * Displays the Main screen.
 */
public class MainActivity extends AppCompatActivity implements MainContract.MvpView {

    private MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*setContentView(R.layout.activity_main);*/
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mainPresenter = new MainPresenter(this);
        binding.setPresenter(mainPresenter);
    }

    ////// MvpView Methods //////
    @Override
    public void showSignInScreen() {
        Toast.makeText(this, "Taking user to the Sign in screen", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showSignUpScreen() {
        Toast.makeText(this, "Taking user to the Sign up screen", Toast.LENGTH_SHORT).show();
    }
}
