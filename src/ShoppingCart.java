public class ShoppingCart {
    int id;
    Brand brand;
    Location location;

    public ShoppingCart(int id, Brand brand, Location location) {
        this.id = id;
        this.brand = brand;
        this.location = location;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "id=" + id +
                ", brand=" + brand +
                ", location=" + location +
                '}';
    }
}
