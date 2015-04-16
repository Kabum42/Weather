package com.example.al264101.uji_weather;

import java.util.Calendar;

/**
 * Created by al264101 on 16/04/15.
 */
public class HourlyPrediction {

    private final Calendar timeStamp;

    private final double temperature;

    private final WeatherCondition condition;

    public HourlyPrediction(Calendar timeStamp, double temperature, WeatherCondition condition) {

        this.timeStamp = timeStamp;
        this.temperature = temperature;
        this.condition = condition;
    }

    public Calendar getTimeStamp() {
        return timeStamp;
    }

    public double getTemperature() {
        return temperature;
    }

    public WeatherCondition getCondition() {
        return condition;
    }

}
