package fruit;

public abstract class Fruit {

    private double totalPrice;


    private double price;

    public Fruit() {
    }
    public Fruit(double price) {
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void discount(double number) {
        this.price = price * number/10;
    }

    public double getPrice() {
        return price;
    }

    public  Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double price) {
        this.totalPrice = price;
    }
}
