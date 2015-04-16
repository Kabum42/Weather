package com.example.al264101.uji_weather;

/**
 * Created by al264101 on 16/04/15.
 */
public interface ResponseReceiver<T> {
    void onRespondReceived (T response);
    void onErrorReceived (String message);
}
