package com.driver;

public class Main {
 static class Product{
     public int product(int x, int y){
         System.out.println("function with two int parameters and int return type ");
         return 0;
     }
     public int product(int x, int y, int z){
         System.out.println("function with three int parameters and int return type ");
         return 0;

     }
     public double product(double x, double y){
         System.out.println("function with two double parameters and double return type ");
         return 0.0;

     }

 }

  public static void main(String[] args){
     Product p = new Product();
     p.product(1,2);
     p.product(1.2,2.4);
     p.product(1,2,3);
  }
}