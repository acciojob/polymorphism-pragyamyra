package com.driver;

public class Main {
 static class Product{
     public int product(int x, int y){
         return (x*y);

     }
     public int product(int x, int y, int z){

         return (x*y*z);

     }
     public double product(double x, double y){

         return (x*y);

     }

 }

  public static void main(String[] args){
     Product p = new Product();
    System.out.println( "Product of two numbers 1 and 2 is "+p.product(1,2));
      System.out.println ( "Product of three numbers 1 , 2 and 3 is " +p.product(1,2,3));
     System.out.println("Product of two double numbers 1.2 and 2.4 is " +p.product(1.2,2.4));

  }
}