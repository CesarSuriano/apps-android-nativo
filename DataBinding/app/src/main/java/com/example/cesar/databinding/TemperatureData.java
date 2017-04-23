package com.example.cesar.databinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by Cesar on 22/04/2017.
 */

public class TemperatureData extends BaseObservable {
    private String celsius;

    public TemperatureData(String celsius) {
        this.celsius = celsius;
    }

    private String fahrenheit;

    @Bindable
    public String getCelsius() {
        return celsius;
    }


    public void setCelsius(String celsius) {

        this.celsius = celsius;
        notifyPropertyChanged(com.example.cesar.databinding.BR.celsius);
    }

}
