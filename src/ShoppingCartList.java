import java.util.ArrayList;
import java.util.List;

public class ShoppingCartList implements Subject{
    List<ShoppingCart> shoppingCarts = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    // notify all observers about all found carts
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(shoppingCarts);
        }
    }
    // observers are informed about all carts when the new one is found
    public void addShoppingCart(ShoppingCart shoppingCart) {
        shoppingCarts.add(shoppingCart);
        notifyObservers();
    }
}
