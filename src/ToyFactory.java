import java.util.ArrayList;
import java.util.List;

public class ToyFactory implements Observed{
    private List<Observer> observers = new ArrayList<>();
    public Product createToy(String type, int minimalAge, float cost) {
        if (type.equalsIgnoreCase("Rubick")) {
            return new Rubick(minimalAge, cost);
        }
        else if (type.equalsIgnoreCase("Buzz")) {
            return new BuzzLighter(minimalAge, cost);
        }
        else {
            return null;
        }
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    @Override
    public void notifyObservers(String type, int minimalAge, float cost) {

        Product toy = createToy(type, minimalAge, cost);

        for (Observer observer : observers) {
            observer.update(toy);
        }
    }
}
