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

   String add_appoitment() {
      Desciption = obj.nextLine();
      d=obj.nextInt();
      m=obj.nextInt();
      y=obj.nextInt();
      return arr( Desciption,   d,   m,  y);
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
}

class Monthly extends Appointment {
       
    void mont_check(){
        
        date = obj.nextInt();

     
        for(int i=0;i<=3;i++){
            arr[1]=arr("des", 1, 2, 2020);
            arr[2]=arr("des", 2, 2, 2020);
            arr[3]=arr("des", 3, 2, 2020);
            arr[4]=add_appoitment();
        }
        for (int i = 1; i <= 3; i++) {
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
        // obj.toaday();
        obj2.mont_check();
    }
}