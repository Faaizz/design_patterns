public class CheeseTopping extends Topping {
    public CheeseTopping(Pizza aPizza) {
        super(aPizza);
    }
    public String getDescription() 
    {
        return this.aPizza.getDescription() + " with Cheese";
    }
    public double cost()
    {
        return this.aPizza.cost() + 1.99;
    }
}
