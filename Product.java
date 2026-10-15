public class Product {
    int productId;
    String productName;
    double price;
    int quantity;

    Product(String productName) {
        this.productName = productName;
        this.price = 500;
        this.productId = 2111;
        this.quantity = 2;
    }

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        this.productId = 000003;
        this.quantity = 4;
    }

    Product(String productName, double price, int productId, int quantity) {
        this.productName = productName;
        this.price = price;
        this.productId = productId;
        this.quantity = quantity;
    }

    double total() {
        return price * quantity;
    }

    void display() {
        System.out
                .println("\nProduct Name: " + productName + "\n Product Price: " + price + "\n Product ID: " + productId
                        + "\nProduct Quantity: " + quantity + "\nTotal Price: " + total());
    }

    public static void main(String[] args) {
        Product pr = new Product("Table");
        Product pr1 = new Product("Chair", 500);
        Product pr2 = new Product("Pen", 5, 11001, 10);
        pr.display();
        pr1.display();
        pr2.display();
    }

}
