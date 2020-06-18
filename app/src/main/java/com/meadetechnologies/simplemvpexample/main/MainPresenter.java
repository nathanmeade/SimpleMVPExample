package com.meadetechnologies.simplemvpexample.main;

import android.view.View;

/**
 * Responsible for handling actions from the View and updating the UI as required.
 */
public class MainPresenter implements MainContract.Presenter {
    private MainContract.MvpView mvpView;

    MainPresenter(MainContract.MvpView mvpView){
        this.mvpView = mvpView;
    }

    ///// Presenter Methods ///////
    @Override
    public void handleSignInButtonClick(View view) {
        mvpView.showSignInScreen();
    }

    @Override
    public void handleSignUpButtonClick(View view) {
        mvpView.showSignUpScreen();
    }
}
