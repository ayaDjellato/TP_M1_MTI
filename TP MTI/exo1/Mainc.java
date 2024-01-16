import java.util.List;
import java.util.ArrayList;

public class Mainc{
    public static void main(String[] args){
        System.out.println("hello");
    
    List<Item> items = new ArrayList<>();

    items.add(new Item(20, 1));
    items.add(new Item(10, 1));
    
    Order order = new Order(items, "dz");
    
    System.out.println("----------------------------------------");
    System.out.println("| Order Total: $" + order.getOrderTotal());
    System.out.println("----------------------------------------");



}}

