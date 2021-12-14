import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Store implements Observer{
    int id;
    Brand brand;
    Set<ShoppingCart> carts = new HashSet<>();

    public Store(int id, Brand brand) {
        this.id = id;
        this.brand = brand;
    }

    @Override
    public void update(List<ShoppingCart> shoppingCarts) {
        for (ShoppingCart shoppingCart: shoppingCarts) {
            if(!carts.contains(shoppingCart) && (shoppingCart.brand == brand || shoppingCart.brand == Brand.unknown)){
                carts.add(shoppingCart);
                System.out.println(brand + ":" + id + " got " + shoppingCart.brand + " cart "
                        + shoppingCart.id + " with location " + shoppingCart.location);
            }
        }
    }
    // print the carts that store has
    public void printCarts(){
        for (ShoppingCart cart:carts) {
            System.out.println(cart);
        }
    }
}
