public class Item {
     private double price;
    private int quantity;

    public Item(double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice(){
        return price;
    }

    public int getQantity(){
        return quantity;
    }

    public void setPrice(double price){
        this.price = price;
    }
    public void setQte(int quantity){
        this.quantity = quantity;
    }
}
