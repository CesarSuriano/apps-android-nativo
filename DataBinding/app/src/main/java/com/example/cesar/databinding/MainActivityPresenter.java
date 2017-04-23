package com.example.cesar.databinding;

/**
 * Created by Cesar on 22/04/2017.
 */

public class MainActivityPresenter {
    private MainActivityContract.View view;

    public MainActivityPresenter(MainActivityContract.View view) {

        this.view = view;
    }
    public void onShowData(TemperatureData temperatureData) {
        view.showData(temperatureData);
    }
}
