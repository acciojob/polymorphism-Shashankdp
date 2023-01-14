package com.driver;

public class Main {
    public static class Product {

        public int product(int x, int y) {
            return x * y;
        }

        public int product(int x, int y, int z) {
            return x * y * z;
        }

        public double product(double x, double y) {
            return x * y;
        }
    }
    public static void main(String[] args){
        Product p=new Product();
        p.product(10,50);
        p.product(10,50,60);
        p.product(10.5,12.5);

    }

}