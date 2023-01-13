package com.driver;

public class Main {
    public static void main(String[] args){
        Product p=new Product();

        p.product(5,4);
        p.product(5,4,2);
        p.product(4.2,2.2);
    }

}
class Product{

    public int product(int x, int y) {
         return x*y;
    }
    public int product(int x, int y, int z) {
        return x*y*z;
    }
    public double product(double x, double y) {
        return x*y;
    }
}