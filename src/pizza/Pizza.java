package pizza;

public abstract class Pizza {
    String description = "Unknown Pizza";

    public String getDescription() {
        return description;
    }

    public abstract int getCost();

    public void order() {
        System.out.println("Give a command to pizza factory");
    }

}