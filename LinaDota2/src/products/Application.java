package products;

public class Application {
    public static void main(String[] args)
    {
    MyProducts myProducts = new MyProducts(100.0, 50.0, 200.0, 500.0);
    Products product1 = new Products("яблоко", -0.5, 0.2, 14.0, 52.0);
    Products product2 = new Products("банан", -1.1, 0.3, 23.0, 96.0);
    Products product3 = new Products("курица", 31.0, 3.6, 0.0, 165.0);
    Products product4 = new Products("молоко", 3.4, 3.6, 4.8, 64.0);
    Products product5 = new Products("рис", 2.7, 0.3, 28.0, 130.0);

    System.out.println(myProducts.addProduct(product1));
    System.out.println(myProducts.addProduct(product2));
    System.out.println(myProducts.addProduct(product3));
    System.out.println(myProducts.addProduct(product4));
    System.out.println(myProducts.addProduct(product5));
    }
}