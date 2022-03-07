public abstract class Topping implements Pizza {
    protected Pizza aPizza;
    public Topping(Pizza aPizza)
    {
        this.aPizza = aPizza;
    }
}
