import java.util.ArrayList;
import java.util.List;

public class Iphone_publisher implements Publisher{
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void register_obs(Observer obs) {
       observers.add(obs);
    }

    @Override
    public void remove_obs(Observer obs) {
        observers.remove(obs);
    }

    @Override
    public void notify_obs() {
       for(Observer observer : observers){
            observer.update();
            System.out.println("your latest news");
       }
    }
    
}
