public class UserInterface implements Observer {
    private double temperature;
    private double windSpeed;
    private double pressure;

    public UserInterface()
    {
        this.temperature = 0;
        this.windSpeed = 0;
        this.pressure = 0;
    }

    public void setTemperature(double temp)
    {
        this.temperature = temp;
        this.display();
    }

    public void setWindSpeed(double speed)
    {
        this.windSpeed = speed;
        this.display();
    }

    public void setPressure(double pressure)
    {
        this.pressure = pressure;
        this.display();
    }

    public void display()
    {
        System.out.println("DISPLAY");
        System.out.println("Temperature: " + this.temperature);
        System.out.println("Wind Speed: " + this.windSpeed);
        System.out.println("Pressure: " + this.pressure);
    }
}
