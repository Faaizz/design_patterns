public class Logger implements Observer {
    private double temperature;
    private double windSpeed;
    private double pressure;

    public Logger()
    {
        this.temperature = 0;
        this.windSpeed = 0;
        this.pressure = 0;
    }

    public void setTemperature(double temp)
    {
        this.temperature = temp;
        this.log();
    }

    public void setWindSpeed(double speed)
    {
        this.windSpeed = speed;
        this.log();
    }

    public void setPressure(double pressure)
    {
        this.pressure = pressure;
        this.log();
    }

    public void log()
    {
        System.out.println("LOG");
        System.out.println("Temperature: " + this.temperature);
        System.out.println("Wind Speed: " + this.windSpeed);
        System.out.println("Pressure: " + this.pressure);
    }
}
