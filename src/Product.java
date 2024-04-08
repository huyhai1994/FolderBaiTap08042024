public class Product {

    String name;
    int price;
    int quantity;

    Product(String name, int price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    String getName(){
        return this.name;
    }
}
