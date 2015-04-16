package com.example.al264101.uji_weather;

/**
 * Created by al264101 on 16/04/15.
 */
public interface IWeatherProvider {

    void getLocationFromName (String name, ResponseReceiver<Location> receiver);

    void getCurrentWeatherData (Location location, ResponseReceiver<CurrentWeatherData> receiver);

    void getForecast (Location location, ResponseReceiver<WeatherPrediction[]> receiver);

    void getHourlyForecast (Location location, ResponseReceiver<HourlyPrediction[]> receiver);

}
