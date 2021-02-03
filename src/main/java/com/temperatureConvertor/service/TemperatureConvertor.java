package com.temperatureConvertor.service;

public interface TemperatureConvertor {

    double fahrenheitToCelsius(double temperature);

    double celsiusToFahrenheit(double temperature);
}

//Question: can i make the above methods static and don't make a new implementation class
