package com.kbShowroom;

public class Car extends Showroom implements utility {

    String car_Model;
    String car_Version;

    String car_Color;

    @Override
    public void setDetails() {
        System.out.print("Car Model: ");
        car_Model=sc.nextLine();
        System.out.print("Car Version: ");
        car_Version=sc.nextLine();
        System.out.print("Car color: ");
        car_Color=sc.next();
        System.out.println();

    }

    @Override
    public void getDetails() {
        System.out.println("Car Model: "+car_Model);
        System.out.println("Car Version: "+car_Version);
        System.out.println("Car color: "+car_Color);
    }
}
