package com.example.al264101.uji_weather;

import java.util.Calendar;

/**
 * Created by al264101 on 16/04/15.
 */
public class WeatherPrediction {

    private final Calendar timeStamp;

    private final double minTemperature, maxTemperature;

    private final WeatherCondition condition;

    public WeatherPrediction(Calendar timeStamp, double minTemperature, double maxTemperature, WeatherCondition condition) {

        this.timeStamp = timeStamp;
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
        this.condition = condition;
    }

    public Calendar getTimeStamp() {
        return timeStamp;
    }

    public double getMinTemperature() {
        return minTemperature;
    }

    public double getMaxTemperature() {
        return maxTemperature;
    }

    public WeatherCondition getCondition() {
        return condition;
    }
}
