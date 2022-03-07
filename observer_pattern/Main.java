public class Main {
    public static void main(String args[])
    {
        Subject weatherStation = new WeatherStation();

        weatherStation.subscribe(new Logger());
        weatherStation.subscribe(new AlertSystem());
        weatherStation.subscribe(new UserInterface());

        weatherStation.updateTemperature(12.3);
        weatherStation.updateWindSpeed(129);
        weatherStation.updatePressure(11.9);
    }
}
