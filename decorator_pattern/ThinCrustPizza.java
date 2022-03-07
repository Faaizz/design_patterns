public class ThinCrustPizza implements Pizza {
    @Override
    public String getDescription() 
    {
        return "This is a Thin Crust Pizza";
    }

    public double cost() 
    {
        return 8.99;
    }
}
