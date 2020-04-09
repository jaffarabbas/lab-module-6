
import java.util.Scanner;

class Product{
     String name;
     String Product_id;

     Product(String name,String Product_id){
            this.name = name;
            this.Product_id = Product_id;
     }
     void show_date(){
         System.out.println(this.name);
         System.out.println(this.Product_id);
     }
}

class Utility extends Product{
    Scanner obj = new Scanner(System.in);
    double Price=100;
    double Discount=0.10f;
 
    Utility(String name,String Product_id,double Price){
       super(name, Product_id);
       this.Price = Price;
    }

    void Discount_(){
         double a = Price * Discount;
         double total = Price - a;
         System.out.println("Discount : "+total);
    }
}

class Food_product extends Product{
     String Date_Expiry;
        Food_product(String name,String Product_id,String Date_Expiry){
        super(name,Product_id);
        this.Date_Expiry = Date_Expiry;
    }
    void show_date(){
        System.out.println("Expiry of "+name+" ID : "+Product_id+" is : "+Date_Expiry);
    }
}


class testclass_ev{
    Product obj = new Product("oil","0009");
    Utility obj2 = new Utility("wires","0010",1000);
    Food_product obj3 = new Food_product("buregr","0012","20-2-2020");
    void view(){
        obj.show_date();
        obj2.Discount_();
        obj3.show_date();
    }
}
 class evTask{
    public static void main(String[] args) {
        testclass_ev obj = new testclass_ev();
        obj.view();
    }
}