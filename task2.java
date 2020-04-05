import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
// class Answer{
//     String arr_ans[] = {"jaffar","3.1423","false"};
// }

class Question{
     public String Ques;
     public String Answer;
     String arr[] = new String[3];
     void Display()
     {

         for(int i =0;i<3;i++){
             System.out.println("Question "+i+":"+arr[i]);
         }
     }

}

class Numeric_Question extends Question{
    Scanner obj = new Scanner(System.in);
    String arr_ans[] = new String[3];
    String check[] = new String[3];
    String a;
     void check(){
         System.out.println("Enter Your Answer");
         for(int i =0;i<check.length;i++){
             a = obj.nextLine();
                     check[i] = a;
        }
        for(int i =0;i<check.length;i++){
            System.out.println(check[i]);
        }

        

     for(int i =0;i<3;i++){
         arr_ans[0] = "1";
         arr_ans[1] = "1";
         arr_ans[2] = "1";
            if(check[0] == arr_ans[0]){
                 System.out.println("true");
            }
            else{
                 System.out.println("false");
            }
        }
       
        // Arrays.asList(arr_ans).contains(a)
        

       
           


     }
}

class task2{
    public static void main(String[] args) {
        Numeric_Question obj =new Numeric_Question();
        obj.Display();
        obj.check();
    }
}