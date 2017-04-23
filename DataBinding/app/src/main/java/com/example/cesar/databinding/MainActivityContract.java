package com.example.cesar.databinding;

/**
 * Created by Cesar on 22/04/2017.
 */

public interface MainActivityContract {
    public interface Presenter {
        void onShowData(TemperatureData temperatureData);
    }

    public interface View {
        void showData(TemperatureData temperatureData);
    }
}
