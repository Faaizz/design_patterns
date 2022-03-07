public class OliveTopping extends Topping {
    public OliveTopping(Pizza aPizza) {
        super(aPizza);
    }
    public String getDescription() 
    {
        return this.aPizza.getDescription() + " with Olive";
    }
    public double cost()
    {
        return this.aPizza.cost() + 0.99;
    }
}
