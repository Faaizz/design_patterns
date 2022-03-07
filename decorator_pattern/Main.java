public class Main {
    public static void main(String [] args)
    {
        Pizza thickPizza = new ThickCrustPizza();
        thickPizza = new CheeseTopping(thickPizza);
        thickPizza = new OliveTopping(thickPizza);

        System.out.println(thickPizza.getDescription());
        System.out.println(thickPizza.cost());

        Pizza thinPizza = new ThinCrustPizza();
        thinPizza = new PepperTopping(thinPizza);
        thinPizza = new OliveTopping(thinPizza);

        System.out.println(thinPizza.getDescription());
        System.out.println(thinPizza.cost());
    }
}
