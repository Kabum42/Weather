package com.example.al264101.uji_weather;

import java.util.Calendar;

/**
 * Created by al264101 on 16/04/15.
 */

public class CurrentWeatherData {

    private final Calendar timeStamp;

    private final double windSpeed, temperature;

    private final int humidity, cloudiness;

    private final WeatherCondition condition;

    public CurrentWeatherData(Calendar timeStamp, double windSpeed, double temperature, int humidity, int cloudiness, WeatherCondition condition) {
        this.timeStamp = timeStamp;
        this.windSpeed = windSpeed;
        this.temperature = temperature;
        this.humidity = humidity;
        this.cloudiness = cloudiness;
        this.condition = condition;
    }

    public Calendar getTimeStamp() {
        return timeStamp;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public double getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getCloudiness() {
        return cloudiness;
    }

    public WeatherCondition getCondition() {
        return condition;
    }
}
