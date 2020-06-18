package com.meadetechnologies.simplemvpexample.main;

/**
 * Responsible for handling actions from the View and updating the UI as required.
 */
public class MainPresenter implements MainContract.Presenter {
    private MainContract.MvpView mvpView;

    MainPresenter(MainContract.MvpView mvpView){
        this.mvpView = mvpView;
    }
}
