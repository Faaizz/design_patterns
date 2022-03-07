public class AlertSystem implements Observer {
    private double temperature;
    private double windSpeed;
    private double pressure;

    public AlertSystem()
    {
        this.temperature = 0;
        this.windSpeed = 0;
        this.pressure = 0;
    }

    public void setTemperature(double temp)
    {
        this.temperature = temp;
        this.alert();
    }

    public void setWindSpeed(double speed)
    {
        this.windSpeed = speed;
        this.alert();
    }

    public void setPressure(double pressure)
    {
        this.pressure = pressure;
        this.alert();
    }

    public void alert()
    {
        System.out.println("ALERT");
        System.out.println("Temperature: " + this.temperature);
        System.out.println("Wind Speed: " + this.windSpeed);
        System.out.println("Pressure: " + this.pressure);
    }
}
