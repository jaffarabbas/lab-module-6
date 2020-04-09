

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

   String Date[] = new String[10];

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


    void today() {
         System.out.println("Day : will 1");
         date = obj.nextInt();
        for (int j = 1; j <= 3; j++) {
            Date[1] = arr("dentuist", 1, 3, 2020);
            Date[2] = arr("heart", 1, 3, 2020);
            Date[3] = arr("barain", 1, 3, 2020);
        }

        for (int i = 1; i <= 3; i++) {
            if (i == date) {
                System.out.println(Date[i]);
                break;
            }
        }
    }


    void add_Apoitment_Today(){
        System.out.println("how many apoitment will this day have  : ");
        n = obj.nextInt();
        System.out.println("Day : ");
        date = obj.nextInt();
        for(int i=1;i<=n;i++){
            Date[date]=add_appoitment();
        }

        for (int i = 1; i <= date; i++) {
            if (i == date) {
                System.out.println(Date[i]);
                break;
            }
        }
    }
}

class Monthly extends Appointment {
       
    void month(){
        System.out.println("Day : ");
        date = obj.nextInt();
        for(int i=0;i<=10;i++){
            Date[1]=arr("des", 1, 2, 2020);
            Date[2]=arr("des", 2, 2, 2020);
            Date[3]=arr("des", 3, 2, 2020);
        }

        Date[4]=add_appoitment();
        for (int i = 1; i <= 4; i++) {
            if (i == date) {
                System.out.println(Date[i]);
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
            Date[date]=add_appoitment();
        }

        for (int i = 1; i <= date; i++) {
            if (i == date) {
                System.out.println(Date[i]);
                break;
            }
        }
    }
}

class year extends Appointment{
    void year_(){
        System.out.println("Day : ");
        date = obj.nextInt();
        for(int i=0;i<=10;i++){
            Date[1]=arr("des", 1, 2, 2020);
            Date[2]=arr("des", 2, 2, 2020);
            Date[3]=arr("des", 3, 2, 2020);
        }

        Date[4]=add_appoitment();
        for (int i = 1; i <= 4; i++) {
            if (i == date) {
                System.out.println(Date[i]);
                break;
            }
        }
    }

    void add_Apoitment_year(){
        System.out.println("how many apoitment will this month have  : ");
        n = obj.nextInt();
        System.out.println("Day : ");
        date = obj.nextInt();
        for(int i=1;i<=n;i++){
            Date[date]=add_appoitment();
        }

        for (int i = 1; i <= date; i++) {
            if (i == date) {
                System.out.println(Date[i]);
                break;
            }
        }
    }
}

class testclass_{
    Scanner scn = new Scanner(System.in);

    Toaday obj = new Toaday();
    Monthly obj2 = new Monthly();
    year obj3 = new year();


    void select(){
        System.out.println("Enter tour desire  \n T For Today \n M For Month\n Y For Year");
        char a =Character.toUpperCase(scn.next().charAt(0));

        switch (a){
            case 'T':
                obj.today();
                break;
            case 'M':
                obj2.month();
                break;
            case 'Y':
                obj3.year_();
            break;
            default:
                System.out.println("Error");
                break;
        }
    }

    void add_app_select(){
        System.out.println("In which class you want to add \n T For Today \n M For Month\n Y For Year");
        char a =Character.toUpperCase(scn.next().charAt(0));

        switch (a){
            case 'T':
                obj.add_Apoitment_Today();
                break;
            case 'M':
                obj2.add_Apoitment_month();
                break;
            case 'Y':
                obj3.add_Apoitment_year();
                break;
            default:
                System.out.println("Error");
                break;
        }
    }

    void Final_select(){
        System.out.println("What to want to do (See or Add)");
        char a =Character.toUpperCase(scn.next().charAt(0));

        switch (a){
            case 'S':
                select();
                break;
            case 'A':
               add_app_select();
                break;
            default:
                System.out.println("Error");
             break;
        }
    }
}

public class pr_task2 {
    public static void main( String[] args) {
        testclass_ obj = new testclass_();
        obj.Final_select();
    }
}