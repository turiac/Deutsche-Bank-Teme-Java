import pizza.*;
import toppings.Pineapple;
import toppings.Tomatoes;

public class SP {
    public static void main(String[] args) {
        Pizza pizza = new Marguerita();
        System.out.println( pizza.getDescription() +
                " Cost: " + pizza.getCost());

        Pizza pizza2 = new Capriciosa();
        System.out.println( pizza2.getDescription() +
                " Cost: " + pizza2.getCost());


        Pizza pizza3 = new ProsciuttoFunghi();
        pizza3 = new Tomatoes(pizza3);
        System.out.println( pizza3.getDescription() +
                " Cost: " + pizza3.getCost());

        Pizza pizza4 = new QuatroStagioni();
        pizza4 = new Pineapple(pizza4);
        System.out.println( pizza4.getDescription() +
                " Cost: " + pizza4.getCost());

        Pizza p5 = new Marguerita();
        Observer observer = new Observer(pizza);
        p5.getDescription();
        p5.getCost();

        Command c1 = new CommandOrder();
        c1.execute(pizza);
    }
}