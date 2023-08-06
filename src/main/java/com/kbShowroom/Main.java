package com.kbShowroom;

import java.util.Scanner;

interface utility{

    void setDetails();
    void getDetails();
}

public class Main {

     static void getmain(){
         System.out.println();
         System.out.println("===========***** This is a ShowRoom App*****=======");
         System.out.println();
         System.out.println("******** Here are the options for you to select ******");
         System.out.println();

        // System.out.println("=============*******");
         System.out.println("1. Add Showroom \t \t \t 2. Add Employee \t \t \t 3. Add Car");
         System.out.println("4. Get showroom info \t \t 5. Get Employee info \t \t 6. Get Car info");
         System.out.println();
         System.out.println();
         System.out.println("======Enter 0 to exit=======");
         System.out.println();



     }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

         int showRoom_Count=0;
         int employee_Count=0;
         int car_Count=0;

         Showroom[] sr=new Showroom[5];
         Employee[] emp=new Employee[5];
         Car[] car=new Car[5];

         int choice=100;
         while (choice!=0) {
             getmain();
             choice=sc.nextInt();

             while (choice != 0 && choice != 9) {
                 switch (choice) {
                     case 1:
                         sr[showRoom_Count] = new Showroom();
                         sr[showRoom_Count].setDetails();
                         showRoom_Count++;
                         System.out.println("1. Add Showroom 9. Main Menu");
                         choice=sc.nextInt();
                         break;

                     case 2:
                         emp[employee_Count]=new Employee();
                         emp[employee_Count].setDetails();
                         employee_Count++;
                         System.out.println("1. Add Employee 9. Main Menu");
                         choice=sc.nextInt();
                         break;

                     case 3:
                         car[car_Count]=new Car();
                         car[car_Count].setDetails();
                         car_Count++;
                         System.out.println("1. Add car 9. Main Menu");
                         choice=sc.nextInt();
                         break;

                     case 4:
                         for(int i=0;i<showRoom_Count;i++){
                             sr[i].getDetails();
                         }
                         System.out.println("0. Exit 9.Main menu");
                         System.out.println();
                         System.out.println();

                         choice=sc.nextInt();
                         break;

                     case 5:
                         for (int i = 0; i < employee_Count; i++) {
                             emp[i].getDetails();
                             System.out.println("0. Exit 9.Main menu");
                             System.out.println();
                             System.out.println();

                             choice=sc.nextInt();
                             break;
                         }

                     case 6:
                         for (int i = 0; i < car_Count; i++) {
                             car[i].getDetails();
                             System.out.println("0. Exit 9.Main menu");
                             System.out.println();
                             System.out.println();

                             choice=sc.nextInt();
                             break;
                         }
                     default:
                         System.out.println("Enter valid details: ");
                         break;


                 }
             }

         }


    }
}
