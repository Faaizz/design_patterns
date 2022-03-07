public interface Subject{
    public void subscribe(Observer observer);
    public void unSubscribe(Observer observer);
    public void updateTemperature(double newValue);
    public void updateWindSpeed(double newValue);
    public void updatePressure(double newValue);
}
