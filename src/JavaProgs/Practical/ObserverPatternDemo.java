package JavaProgs.Practical;

import java.util.ArrayList;
import java.util.List;

// Observer Interface
interface Observer {
    void update(float temperature);
}

// Subject Interface
interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

// Concrete Subject (Weather Station)
class WeatherStation implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private float temperature;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();  // Notify all observers
    }
}

// Concrete Observer (Phone Display)
class PhoneDisplay implements Observer {
    private String name;

    public PhoneDisplay(String name) {
        this.name = name;
    }

    @Override
    public void update(float temperature) {
        System.out.println(name + " Display: Temperature updated to " + temperature + "°C");
    }
}

// Main Class (Execution)
public class ObserverPatternDemo {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Observer phone1 = new PhoneDisplay("Phone 1");
        Observer phone2 = new PhoneDisplay("Phone 2");

        weatherStation.addObserver(phone1);
        weatherStation.addObserver(phone2);

        System.out.println("Setting temperature to 30°C...");
        weatherStation.setTemperature(30);

        System.out.println("Setting temperature to 25°C...");
        weatherStation.setTemperature(25);
    }
}

