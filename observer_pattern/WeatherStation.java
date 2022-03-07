import java.util.ArrayList;

public class WeatherStation implements Subject {
    private ArrayList<Observer> observers;
    private double temperature;
    private double windSpeed;
    private double pressure;

    public WeatherStation()
    {
        this.observers = new ArrayList<>();
        this.temperature = 0;
        this.windSpeed = 0;
        this.pressure = 0;
    }

    public void subscribe(Observer ob)
    {
        this.observers.add(ob);
    }

    public void unSubscribe(Observer ob)
    {
        boolean result = this.observers.remove(ob);
        if (!result) {
            System.out.println("Could not remove observer");
        }
    }

    public void updateTemperature(double newValue)
    {
        this.temperature = newValue;
        for (Observer ob : this.observers) {
            ob.setTemperature(this.temperature);
        }
    }

    public void updateWindSpeed(double newValue)
    {
        this.windSpeed = newValue;
        for (Observer ob : this.observers) {
            ob.setWindSpeed(this.windSpeed);
        }
    }

    public void updatePressure(double newValue)
    {
        this.pressure = newValue;
        for (Observer ob : this.observers) {
            ob.setPressure(this.pressure);
        }
    }
}
