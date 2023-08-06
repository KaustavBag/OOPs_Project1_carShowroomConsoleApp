package com.kbShowroom;

import java.util.UUID;

public class Employee extends Showroom implements utility{

    String employee_Name;
    String employee_Id;
    int employee_Age;
    String employee_Designation;

    @Override
    public void setDetails() {
        System.out.println("***** Enter Employee details*****: ");
        System.out.println();
        UUID uuid=UUID.randomUUID();
        employee_Id=String.valueOf(uuid);
        System.out.print("employee_Name: ");
        employee_Name=sc.nextLine();
        System.out.print("employee_Age: ");
        employee_Age=sc.nextInt();
        System.out.print("employee_Designation: ");
        employee_Designation=sc.next();
        System.out.print("Showroom Name: ");
        showroom_Name=sc.next();
        System.out.println();
    }

    @Override
    public void getDetails() {
        System.out.println("employee_Name: "+employee_Name);
        System.out.println("employee_Id: "+employee_Id);
        System.out.println("employee_Age: "+employee_Age);
        System.out.println("employee_Designation: "+employee_Designation);
    }
}
