package org.example;
import java.util.Scanner;


public class App {
  public static void main(String[] args) {
System.out.println("Welcome to the Ounce Conversion Program!\n");

    Scanner scanner = new Scanner(System.in);
    System.out.print("How many ounces do you have? ");
    int ounces = scanner.nextInt();
    
    scanner.close();


    Converter converter = new Converter();

    System.out.println(converter.toPounds(ounces));
    System.out.println(converter.toPoundsAndOunces(ounces));

    System.out.println("\nThank you for using the OCP!");
  }
}
