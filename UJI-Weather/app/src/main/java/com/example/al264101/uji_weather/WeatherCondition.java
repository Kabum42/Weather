package com.example.al264101.uji_weather;

/**
 * Created by al264101 on 16/04/15.
 */
public class WeatherCondition {

    private final String main;

    private final String description;

    private final String icon;

    public WeatherCondition(String main, String description, String icon) {
        this.main = main;
        this.description = description;
        this.icon = icon;
    }

    public String getMain() {
        return main;
    }

    public String getDescription() {
        return description;
    }

    public String getIcon() {
        return icon;
    }
}
