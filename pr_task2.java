import java.io.IOException;
import java.util.ArrayList;



class Appointment{
    String Desciption;
   String arr(String Desciption,String d,String m,String y){
    this.Desciption = Desciption;
       return Desciption+"  date : "+d+" "+m+" "+y;
    }
    
    String arr[] = new String[3];

    String ap[] = new String[3];


    void a(){
    for(int j = 0; j<3;j++){
        arr[j].arr("jaffar","2","3","2020");
    }
    for(int j = 0; j<3;j++){
        System.out.println(arr("jaffar",3,3,2020));
    }
   }
   String date(int a,int b,int c){
       return ""+a+""+b+""+c;
   }

   void check(){
       System.out.println("Enter date : ");
       date(3,3,2020);
       if(date(3,3,2020) == arr[0]){
           System.out.println(this.Desciption);
       }
   }
    
}





public class pr_task2 {
    public static void main(String[] args){
        Appointment obj =new Appointment();

        obj.a();
        obj.check();
    }
}