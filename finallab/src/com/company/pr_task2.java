package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


class Appointment{
    Scanner obj =new Scanner(System.in);
    String Desciption;
    int date,n,m,y,d;
    String arr( String Desciption,  int d,  int m,  int y) {
       return Desciption + "  date : " + d + " " + m + " " + y;
    }

   String arr[] = new String[10];

   String add_appoitment(){
       System.out.println("Description : ");
       Desciption = obj.next();
       System.out.println("Day : ");
       d=obj.nextInt();
       System.out.println("Month : ");
       m=obj.nextInt();
       System.out.println("Year : ");
       y=obj.nextInt();
       return arr(Desciption,   d,   m,  y);
   }
}

class Toaday extends Appointment {
    Scanner obj = new Scanner(System.in);


    void toaday() {
        // date = obj.nextInt();
        for (int j = 1; j <= 3; j++) {
            arr[1] = arr("jaffar", 1, 3, 2020);
            arr[2] = arr("fahad", 2, 3, 2020);
            arr[3] = arr("ahmed", 3, 3, 2020);
        }

        for (int i = 1; i <= 3; i++) {
            if (i == date) {
                System.out.println(arr[i]);
                break;
            }
        }
    }


    void add_Apoitment_Today(){
        System.out.println("how many apoitment will this day have  : ");
        n = obj.nextInt();
        date = obj.nextInt();
        for(int i=1;i<=n;i++){
            arr[date]=add_appoitment();
        }

        for (int i = 1; i <= date; i++) {
            if (i == date) {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}

class Monthly extends Appointment {
       
    void mont_check(){
        System.out.println("Day : ");
        date = obj.nextInt();
        for(int i=0;i<=10;i++){
            arr[1]=arr("des", 1, 2, 2020);
            arr[2]=arr("des", 2, 2, 2020);
            arr[3]=arr("des", 3, 2, 2020);
        }

        arr[4]=add_appoitment();
        for (int i = 1; i <= 4; i++) {
            if (i == date) {
                System.out.println(arr[i]);
                break;
            }
        }
    }

    void add_Apoitment_month(){
        System.out.println("how many apoitment will this month have  : ");
        n = obj.nextInt();
        System.out.println("Day : ");
        date = obj.nextInt();
        for(int i=1;i<=n;i++){
            arr[date]=add_appoitment();
        }

        for (int i = 1; i <= date; i++) {
            if (i == date) {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}

public class pr_task2 {
    public static void main( String[] args) {
        Toaday obj = new Toaday();
        Monthly obj2 = new Monthly();
        obj.add_Apoitment_Today();
        // obj.toaday();
//        obj2.mont_check();
       // obj2.add_met();
    }
}