import pizza.*;

class Observer {
    Pizza pizza;
    public Observer(Pizza subject) {
        this.pizza = pizza;;
    }
    public void receiveUpdate() {
        System.out.println("State = " + pizza.getDescription());
    }
}