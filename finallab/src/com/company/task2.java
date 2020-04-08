package com.company;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;



class Answer{
    String arr_ans[] = {"jaffar","3.1423","false"};
    String Corect_responce;
    double answer;
}

class Question extends Answer{
     String arr[] = new String[3];
     Scanner obj = new Scanner(System.in);
     String check[] = new String[3];
     String a;
     void Display()
     {
         for(int i =0;i<3;i++){
             System.out.println("Question "+i+":"+arr[i]);
         }
     }

      void check(){
          System.out.println("Enter Your Answer");
          for(int i =0;i<check.length;i++){
              a = obj.nextLine();
                      check[i] = a;
         }
         for(int i =0;i<check.length;i++){
             System.out.println(check[i]);
         }
         Answer_check();
      }

      void setanswer(double Corect_responce2){
        Corect_responce2 =3.1432;
        answer = Corect_responce2;
      }

      void Answer_check(){
     for(int i =0;i<3;i++){
             double response = Double.parseDouble(check[1]);
            setanswer(response);
             if(check[i].equals(arr_ans[i])){
                  System.out.println("true");
                  Corect_responce=check[i];
             }
             else if( response == 3.1432 || check[1] =="3.1432"){
               // ob.check_dob("3.1423");
                System.out.println("true");
               
             }
             else{
                System.out.println("false");
             }
    }
}
public static class Numeric extends Question{
    public boolean check_dob(String res) {
        double response = Double.parseDouble(res);
        return Math.abs(response - answer) >= 0.01;
   }
   public void setvalue(){
    System.out.print(check_dob(check[1]));
 }
}

static class test{
         Numeric obj = new Numeric();
    void check(){
        obj.setvalue();
        obj.Display();
        obj.check();}
}
static class task2{
    public void main( String[] args) {
        //  Question obj = new Question();
        // obj.Display();
        // obj.check();
        test ob = new test();
        ob.check();
    }
}
}