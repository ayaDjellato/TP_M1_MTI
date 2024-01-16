import java.util.List;

public class Order {
    private List<Item> items;
    private String country;

     public Order(List<Item> items, String country) {
        this.items = items;
        this.country = country;
    }


     public double getOrderTotal() {
        double totalHT = calculateTotalHT();
        double tax = getTax();
        return totalHT + calculateTotalTVA(totalHT, tax);
    }

     private double calculateTotalHT() {
        return items.stream().mapToDouble(item -> item.getPrice() * item.getQantity()).sum();
    }

    private double calculateTotalTVA(double totalHT, double tax) {
        return totalHT * tax / 100;
    }

    private double getTax(){
        TaxCalcul tax = new TaxCalcul();

        return tax.calculateTax(country);
    }

}
