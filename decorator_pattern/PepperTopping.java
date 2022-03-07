public class PepperTopping extends Topping {
    public PepperTopping(Pizza aPizza) {
        super(aPizza);
    }
    public String getDescription() 
    {
        return this.aPizza.getDescription() + " with Pepper";
    }
    public double cost()
    {
        return this.aPizza.cost() + 1.29;
    }
}
