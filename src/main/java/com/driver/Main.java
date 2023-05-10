package com.driver;

public class Main {
  public static void main(String args[]){
      B b1=new B();
//      System.out.println(b1.meth());
//      //Invoking method from class A
//      System.out.println(b1.meth());
      b1.meth();
    b1.meth();
  }
  public static class A{
      public String meth(){
          return "Invoking method from class A";
      }
  }
  public static class B extends A{
    @Override
      public String meth(){
          return "Method is overridden in Extended class B";
      }
    }
}
