package com.driver;

public class Main {
    public static void main(String[] args){
        Product p=new Product();
        int x=0;
        int y=0;
        int z=0;

        double a=0.0;
        double b=0.0;

        p.product(x,y);
        p.product(x,y,z);
        p.product(a,b);
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