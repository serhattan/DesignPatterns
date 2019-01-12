package main.ObserverPattern;

public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;

        display();
    }

    @Override
    public void display() {
        System.out.print("Tahmin: ");
        if (currentPressure > lastPressure) {
            System.out.println("Hava daha da açacak! Güzel bir gün!");
        } else if (currentPressure == lastPressure) {
            System.out.println("Çoğunlukla aynı");
        } else if (currentPressure < lastPressure) {
            System.out.println("Soğuğa dikkat edin, yağmurlu hava");
        }
    }
}
