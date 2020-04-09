

class character{
    String name;
    String move;
    String speak;
    void story(){
        System.out.println("In this story there are two types of character : ");
    }
}

class Germs extends character{
    String desease;
    void Flying_germs(){
        String property="Fly";
        System.out.println("We are the the air germs we can "+property+" and spread toxies");
    }
    Germs(String n){
         name = n;
    }
    void germs(){
        move = "Make Move";

        System.out.println(name+" : go onward break the city and call the flying germs !!!!!!!");

        System.out.println(move);
        
        System.out.println("They come ");
       
        Flying_germs();
    }
}

class Human extends character{
    String wach="savegard soap";
    String spkids[] ={"kid 1","Kid2","klid3"};
    void protecter(){
    String Safe_gard="Safe gard";
  
    String Docters="Zibagooo";

    System.out.println("Call maidto savegard");

    System.out.println(Safe_gard+"I arived \n call the kids docter "+Docters);

    for(int i =0;i<3;i++){
        System.out.println("We Arrive "+spkids[i]);
    }

    System.out.println("BAttle start every one washes hand with "+wach+"Attt end  \n protecters wins");
    }
}

class sunerio extends character{
    Germs obj = new Germs("DArtoo");
    Human obj2 =new Human();
    void play(){
        story();
        obj.germs();
        obj2.protecter();
    }
}

public class pr_task1 {
     public static void main(String[] args) {
        sunerio obj = new sunerio();
        obj.play();
    }
}