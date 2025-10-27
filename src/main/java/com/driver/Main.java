package com.driver;



public class Main {

  class Product{
      public int product(int x, int y) {
        return x+y;
      }

    public int product(int x, int y, int z) {
      return x+y+z;
    }
    public double product(double x, double y) {
      return x+y;
    }
  }

  Product p = new Product();
  p.product(4,3);
 p.product(4,3,5);
p.product(4.0,3.0);


    

}
