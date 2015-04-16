package com.example.al264101.uji_weather;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by al264101 on 16/04/15.
 */
public class MockWeather implements IWeatherProvider{

    @Override
    public void getLocationFromName(String name, ResponseReceiver<Location> receiver) {
        String fullName = null;
        char charAt0 = Character.toLowerCase(name.charAt(0));

        switch(charAt0){
            case 'c' : fullName = "Castellon";
                break;
            case 'v' : fullName = "Valencia";
                break;
            case 'm' : fullName = "Madrid";
                break;
            case 'b' : fullName = "Barcelona";
                break;

            //COMPLETE WITH AS MANY CASES AS WANTED
        }

        if (fullName != null)
            receiver.onRespondReceived(new Location(fullName, "Spain", 0, 10));
        else
            receiver.onErrorReceived("Error: " + name + "unknown");
    }

    @Override
    public void getCurrentWeatherData(Location location, ResponseReceiver<CurrentWeatherData> receiver) {
        String fullName = null;
        char charAt0 = Character.toLowerCase(location.getName().charAt(0));

        Calendar timeStamp = null;
        double windSpeed  = Double.parseDouble(null);
        double temperature = Double.parseDouble(null);
        int humidity = Integer.parseInt(null);
        int cloudiness = Integer.parseInt(null);
        WeatherCondition condition = null;

        switch(charAt0){
            case 'c' :
                fullName = "Castellon";
                timeStamp = new GregorianCalendar(2014,4,16,20,20,45);
                windSpeed = 28.7D;
                temperature = 300D;
                humidity = 20;
                cloudiness = 50;
                condition = new WeatherCondition("sunny", "SO BRIGHT MAN!", "8d");
                break;
            case 'v' :
                fullName = "Valencia";
                timeStamp = new GregorianCalendar(2018,4,16,20,20,65);
                windSpeed = 90.7D;
                temperature = -90D;
                humidity = -5;
                cloudiness = 900000;
                condition = new WeatherCondition("cold", "IT'S FUCKING FREEZING", "~.~");
                break;
            case 'm' :
                fullName = "Madrid";
                timeStamp = new GregorianCalendar(1800,13,25,20,20,40);
                windSpeed = 5000.7D;
                temperature = 0D;
                humidity = 0;
                cloudiness = -5;
                condition = new WeatherCondition("regular", "Meh", "2");
                break;
            case 'b' : fullName = "Barcelona";
                timeStamp = new GregorianCalendar(-3000,13,32,500,-20,40);
                windSpeed = 0.7D;
                temperature = 20D;
                humidity = 05;
                cloudiness = -50;
                condition = new WeatherCondition("( ͡° ͜ʖ ͡°)", "Sexy", "3.14");
                break;
        }

        if (fullName != null)
            receiver.onRespondReceived(new CurrentWeatherData(timeStamp, windSpeed, temperature, humidity, cloudiness, condition));
        else
            receiver.onErrorReceived("Error: " + location.getName() + "unknown");
    }

    @Override
    public void getForecast(Location location, ResponseReceiver<WeatherPrediction[]> receiver) {
        String fullName = null;
        char charAt0 = Character.toLowerCase(location.getName().charAt(0));

        Calendar timeStamp = null;
        double minTemperature  = Double.parseDouble(null);
        double maxTemperature = Double.parseDouble(null);
        WeatherCondition condition = null;

        WeatherPrediction[] predictions = new WeatherPrediction[7];

        switch(charAt0){
            case 'c' :
                fullName = "Castellon";
                timeStamp = new GregorianCalendar(2014,4,16,20,20,45);
                minTemperature = 300D;
                maxTemperature = 80000D;
                condition = new WeatherCondition("sunny", "SO BRIGHT MAN!", "8d");
                break;
            case 'v' :
                fullName = "Valencia";
                timeStamp = new GregorianCalendar(2018,4,16,20,20,65);
                minTemperature = -90D;
                maxTemperature = -100D;
                condition = new WeatherCondition("cold", "IT'S FUCKING FREEZING", "~.~");
                break;
            case 'm' :
                fullName = "Madrid";
                timeStamp = new GregorianCalendar(1800,13,25,20,20,40);
                minTemperature = 0D;
                maxTemperature = 0D;
                condition = new WeatherCondition("regular", "Meh", "2");
                break;
            case 'b' : fullName = "Barcelona";
                timeStamp = new GregorianCalendar(-3000,13,32,500,-20,40);
                minTemperature = 20D;
                maxTemperature = Double.parseDouble(null);
                condition = new WeatherCondition("( ͡° ͜ʖ ͡°)", "Sexy", "3.14");
                break;
        }

        predictions[0] = new WeatherPrediction(timeStamp, minTemperature, maxTemperature, condition);

        if (fullName != null)
            receiver.onRespondReceived(predictions);
        else
            receiver.onErrorReceived("Error: " + location.getName() + "unknown");

    }

    @Override
    public void getHourlyForecast(Location location, ResponseReceiver<HourlyPrediction[]> receiver) {
        String fullName = null;
        char charAt0 = Character.toLowerCase(location.getName().charAt(0));

        Calendar timeStamp = null;
        double temperature  = Double.parseDouble(null);
        WeatherCondition condition = null;

        HourlyPrediction[] predictions = new HourlyPrediction[8];

        switch(charAt0){
            case 'c' :
                fullName = "Castellon";
                timeStamp = new GregorianCalendar(2014,4,16,20,20,45);
                temperature = 300D;
                condition = new WeatherCondition("sunny", "SO BRIGHT MAN!", "8d");
                break;
            case 'v' :
                fullName = "Valencia";
                timeStamp = new GregorianCalendar(2018,4,16,20,20,65);
                temperature = -90D;
                condition = new WeatherCondition("cold", "IT'S FUCKING FREEZING", "~.~");
                break;
            case 'm' :
                fullName = "Madrid";
                timeStamp = new GregorianCalendar(1800,13,25,20,20,40);
                temperature = 0D;
                condition = new WeatherCondition("regular", "Meh", "2");
                break;
            case 'b' : fullName = "Barcelona";
                timeStamp = new GregorianCalendar(-3000,13,32,500,-20,40);
                temperature = Double.parseDouble(null);
                condition = new WeatherCondition("( ͡° ͜ʖ ͡°)", "Sexy", "3.14");
                break;
        }

        predictions[0] = new HourlyPrediction(timeStamp, temperature, condition);

        if (fullName != null)
            receiver.onRespondReceived(predictions);
        else
            receiver.onErrorReceived("Error: " + location.getName() + "unknown");
    }
}
