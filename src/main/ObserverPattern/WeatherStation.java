package main.ObserverPattern;

public class WeatherStation {
    public static void main(String[] args) {
        System.out.println("\n\n");

        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(19.4f, 10, 60);
        weatherData.setMeasurements(10.6f, 16, 10);
        weatherData.setMeasurements(45.4f, 12, 29.92f);
    }
}
