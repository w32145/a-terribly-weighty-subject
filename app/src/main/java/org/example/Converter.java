package org.example;

public class Converter {

  public String toPounds(int ounces) {
    double pounds = ounces / 16.0;

    if (pounds == 1.0) {
      return 1.0000 + " lb";
    }
    return String.format("%.4f", pounds) + " lbs";
  }

  public String toPoundsAndOunces(int ounces) {
    int pounds = ounces / 16;
    int remainder = ounces % 16;

    if (pounds == 1) {
      return pounds + " lb " + remainder + " oz";
    }
    
      return pounds + " lbs " + remainder + " oz";
  }
  
}
