import pizza.*;

abstract class Command {
    public abstract void execute(Pizza pizza);
}

class CommandOrder extends Command {

    @Override
    public void execute(Pizza pizza) {
        pizza.order();
    }

}