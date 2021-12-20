import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartListTest {

    @Test
    public void test() {
        // create multiple stores
        Store store1 = new Store(4, Brand.Edeka);
        Store store2 = new Store(3, Brand.Edeka);
        Store store3 = new Store(6, Brand.Lidl);
        Store store4 = new Store(1, Brand.Aldi);
        Store store5 = new Store(5, Brand.Kaufhof);
        Store store6 = new Store(7, Brand.Penny);
        Store store7 = new Store(2, Brand.Bauhaus);
        // create different carts
        ShoppingCart shoppingCart1 = new ShoppingCart(100, Brand.Edeka, new Location(70.1, 66.2));
        ShoppingCart shoppingCart2 = new ShoppingCart(89, Brand.unknown, new Location(76.5, 43.2));
        ShoppingCart shoppingCart3 = new ShoppingCart(12, Brand.Aldi, new Location(34.5, 67.8));
        ShoppingCart shoppingCart4 = new ShoppingCart(5, Brand.Kaufhof, new Location(30.0, 61.1));
        ShoppingCart shoppingCart5 = new ShoppingCart(66, Brand.Lidl, new Location(90.5, 80.1));
        ShoppingCart shoppingCart6 = new ShoppingCart(89, Brand.Kaufhof, new Location(77.5, 67.8));
        ShoppingCart shoppingCart7 = new ShoppingCart(43, Brand.Bauhaus, new Location(22.1, 19.8));
        ShoppingCart shoppingCart8 = new ShoppingCart(2, Brand.Penny, new Location(32.0, 67.8));
        ShoppingCart shoppingCart9 = new ShoppingCart(90, Brand.Lidl, new Location(72.9, 50.3));

        ShoppingCartList list = new ShoppingCartList();
        // register all stores that we have and add to the list
        list.registerObserver(store1);
        list.registerObserver(store2);
        list.registerObserver(store3);
        list.registerObserver(store4);
        list.registerObserver(store5);
        list.registerObserver(store6);
        list.registerObserver(store7);
        // add all carts found in the list
        list.addShoppingCart(shoppingCart1);
        list.addShoppingCart(shoppingCart2);
        list.addShoppingCart(shoppingCart3);
        list.addShoppingCart(shoppingCart4);
        list.addShoppingCart(shoppingCart5);
        list.addShoppingCart(shoppingCart6);
        list.addShoppingCart(shoppingCart7);
        list.addShoppingCart(shoppingCart8);
        list.addShoppingCart(shoppingCart9);

        // assert that the list contains all added carts
        assertEquals(9, list.shoppingCarts.size());
        assertTrue(list.shoppingCarts.contains(shoppingCart1));
        assertTrue(list.shoppingCarts.contains(shoppingCart2));
        assertTrue(list.shoppingCarts.contains(shoppingCart3));
        assertTrue(list.shoppingCarts.contains(shoppingCart4));
        assertTrue(list.shoppingCarts.contains(shoppingCart5));
        assertTrue(list.shoppingCarts.contains(shoppingCart6));
        assertTrue(list.shoppingCarts.contains(shoppingCart7));
        assertTrue(list.shoppingCarts.contains(shoppingCart8));
        assertTrue(list.shoppingCarts.contains(shoppingCart9));

        // assert that each store contains only all its carts
        assertEquals(2, store1.carts.size());
        assertTrue(store1.carts.contains(shoppingCart1));
        assertTrue(store1.carts.contains(shoppingCart2));

        assertEquals(2, store2.carts.size());
        assertTrue(store2.carts.contains(shoppingCart1));
        assertTrue(store2.carts.contains(shoppingCart2));

        assertEquals(3, store3.carts.size());
        assertTrue(store3.carts.contains(shoppingCart2));
        assertTrue(store3.carts.contains(shoppingCart5));
        assertTrue(store3.carts.contains(shoppingCart9));

        assertEquals(2, store4.carts.size());
        assertTrue(store4.carts.contains(shoppingCart2));
        assertTrue(store4.carts.contains(shoppingCart3));

        assertEquals(3, store5.carts.size());
        assertTrue(store5.carts.contains(shoppingCart2));
        assertTrue(store5.carts.contains(shoppingCart4));
        assertTrue(store5.carts.contains(shoppingCart6));

        assertEquals(2, store6.carts.size());
        assertTrue(store6.carts.contains(shoppingCart2));
        assertTrue(store6.carts.contains(shoppingCart8));

        assertEquals(2, store7.carts.size());
        assertTrue(store7.carts.contains(shoppingCart2));
        assertTrue(store7.carts.contains(shoppingCart7));
    }
}