package com.company;

public class Main {

    public static void main(String[] args) {
String numberAsString= "2020.543";
        System.out.println("NumberAsString = " + numberAsString);

        double number = Double.parseDouble(numberAsString);
        System.out.println(number);
        numberAsString += 1;
        number +=1;
        System.out.println(numberAsString);
        System.out.println(number);
    }
}
