class one{
    void run(){
        System.out.println("one");
    }
}

class two extends one{
    void run(){
        System.out.println("two");
    }
}

class ja{
    public static void main (String[] args) {
        two ob = new two();
        ob.run();
    }
}