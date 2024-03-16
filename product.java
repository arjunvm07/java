class Product {
    int pcode;
    String pname;
    double price;

    Product(int pcode, String pname, double price) {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }
}

class MainClass {
    public static void main(String[] args) {

        Product product1 = new Product(1, "Product 1", 10.50);
        Product product2 = new Product(2, "Product 2", 15.75);
        Product product3 = new Product(3, "Product 3", 8.25);

        Product cheapestProduct = product1;
        if (product2.price < cheapestProduct.price) {
            cheapestProduct = product2;
        }
        if (product3.price < cheapestProduct.price) {
            cheapestProduct = product3;
        }

        System.out.println("The cheapest product is: " + cheapestProduct.pname + " with price " + cheapestProduct.price);
    }
}
