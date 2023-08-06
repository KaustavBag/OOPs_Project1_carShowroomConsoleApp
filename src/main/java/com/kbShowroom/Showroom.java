package com.kbShowroom;

import java.util.Scanner;
import java.util.UUID;

public class Showroom implements utility{
   Scanner sc=new Scanner(System.in);


   String showroom_Name;
   String showroom_Address;
   int total_Employee_No=0;
   String manager_Name;
   int total_Car_Count;

public void setDetails(){
   System.out.print("showroom_Name: ");
   showroom_Name=sc.nextLine();
   System.out.print("showroom_Address: ");
   showroom_Address=sc.nextLine();
   System.out.print("total_Employee_No: ");
   total_Employee_No=sc.nextInt();
   System.out.print("manager_Name: ");
   manager_Name=sc.next();
   System.out.print("total_Car_Count: ");
   total_Car_Count=sc.nextInt();
   System.out.println();
}

public void getDetails(){
   System.out.println();
   System.out.println("showroom_Name: "+ showroom_Name);
   System.out.println("showroom_Address: "+ showroom_Address);
   System.out.println("total_Employee_No: "+ total_Employee_No);
   System.out.println("manager_Name: "+ manager_Name);
   System.out.println("total_Car_Count: "+ total_Car_Count);

}

}
