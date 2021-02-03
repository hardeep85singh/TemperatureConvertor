package com.temperatureConvertor.service;

public class TemperatureConvertorImp implements TemperatureConvertor{

    @Override
    public double fahrenheitToCelsius(double temperature) {
        return (temperature - 32) * 5 / 9;
    }

    @Override
    public double celsiusToFahrenheit(double temperature) {
        return (temperature * 9 / 5) + 32;
    }


}
