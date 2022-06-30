package executor;

//Write a program to test this keyword with constructor by calling default from parameterized

public class ThisWithConstructor {

 int a;

 // Default Constructor
 ThisWithConstructor(){
     System.out.println("\nDefault body...");
 }

 // Parameterized Constructor
 ThisWithConstructor(int a){

     // Calling Default Constructor
     this();

     this.a = a;
     System.out.println("Parameterized body...: " + a);
 }

 public static void main(String[] args){

     ThisWithConstructor t = new ThisWithConstructor(10);
 }
}